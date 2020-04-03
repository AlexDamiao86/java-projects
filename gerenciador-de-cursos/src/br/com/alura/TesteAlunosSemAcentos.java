package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        boolean adicionou;
        
		adicionou = alunos.add("Paulo");
		System.out.println("Paulo foi adicionado ao Set? " + adicionou);
		
		adicionou = alunos.add("Alberto");
		System.out.println("Alberto foi adicionado ao Set? " + adicionou);
		
		adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
		
		adicionou = alunos.add("Nico");
		System.out.println("Nico foi adicionado ao Set? " + adicionou);
		
		System.out.println(alunos.size());

		adicionou = alunos.add("Pedro");
		System.out.println(alunos.size());
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
    }
}