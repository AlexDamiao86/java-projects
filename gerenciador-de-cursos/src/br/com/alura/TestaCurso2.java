package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Collections", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
	
		System.out.println(curso.getAulas());
		
		List<Aula> aulasImutaveis = curso.getAulas();
				
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
//		System.out.println(curso.getTempoTotal());
		
		System.out.println(curso);
	}

}
