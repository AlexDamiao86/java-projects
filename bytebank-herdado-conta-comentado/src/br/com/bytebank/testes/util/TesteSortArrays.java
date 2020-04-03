package br.com.bytebank.testes.util;

import java.util.Arrays;
import java.util.Random;

public class TesteSortArrays {

	public static void main(String[] args) {
		int[] numeros = new int[5]; //Cada posição inicializada com 0 
		
		Random numero = new Random(); 
		//Determina um padrão de repetição
		//numero.setSeed(0); 
				
		//Pede um array de 5 posicoes de numeros aleatorios
		numeros = numero.ints(5, 10, 90).toArray(); 
		
		Arrays.sort(numeros); //método utilitario sort
			
		//Percorre-se o array e imprime na tela cada um
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(numeros); //Imprime o endereco de referencia numeros

	}
	
}
