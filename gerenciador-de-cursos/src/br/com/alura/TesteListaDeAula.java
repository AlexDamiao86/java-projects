package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArraysLists", 21);
		Aula a2 = new Aula("Listas de objetos", 19);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>(); 
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//Imprime array desordenado
		System.out.println(aulas);
		
		//Ordenando pelo Titulo de aula de forma ascendente
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Ordenando pelo Tempo de aula de forma ascendente
		Collections.sort(aulas, Comparator.comparing(Aula :: getTempo));
		//Implementacao alternativa ao comando acima
//		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
