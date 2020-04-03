package br.com.bytebank.testes;

import java.util.Random;

public class TesteArray {

	public static void main(String[] args) {
		int[] idades = new int[5]; //Cada posição inicializada com 0 
		double[] precos = new double[5];
		double precos2[] = new double[5];
		
		Random numero = new Random(); 
		//Determina um padrão de repetição
		//numero.setSeed(0); 
		
		//Pede um array de 5 posicoes de numeros aleatorios
		idades = numero.ints(5, 18, 90).toArray(); 
		
		//Percorre-se o array e imprime na tela a idade
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
