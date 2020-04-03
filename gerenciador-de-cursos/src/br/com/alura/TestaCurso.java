package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Collections", "Paulo Silveira");
		List<Aula> aulas = curso.getAulas();
		
		System.out.println(aulas);
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
	
		System.out.println(aulas);
		System.out.println(curso.getAulas());
	}

}
