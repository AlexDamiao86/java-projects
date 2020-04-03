package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; 
		
		//Wrapper - Aquele que embrulha o primitivo
		Integer idadeRef = Integer.valueOf(29); //Autoboxing - Primitivo para referencia
		int valor = idadeRef.intValue(); //Unboxing - Referencia para primitivo 
		
		System.out.println(idadeRef.doubleValue());
		
		//Alguns metodos da classe Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		String s = args[0]; //14400
		//Integer numero = Integer.valueOf(s); //Nao eh a opcao mais adequada pois devolve uma referencia e depois se faz unboxing 
		int numero = Integer.parseInt(s); //Geralmente eh a opcao mais adequada pois devolve um primitivo
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>(); 
		numeros.add(29); //Realizado autoboxing automaticamente - Transforma-se o 29 em referencia
						 //Armazena-se a referencia
		numeros.add(100);
		System.out.println(numeros);
  	}
	
}
