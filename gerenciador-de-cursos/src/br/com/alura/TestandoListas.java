package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		Collections.sort(aulas);
		System.out.println();
		System.out.println("Depois de ordenado:");
		
		
		for (String aula : aulas) {
		    System.out.println("Aula: " + aula);
		}
		
		System.out.println();
		
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula:: " + aulas.get(i));
        }
		
        System.out.println();
        
		// Usando o método forEach e Lambda
		aulas.forEach(aula -> System.out.println("Aula = " + aula));
	}
}