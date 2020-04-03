package br.com.bytebank.testes;

import java.util.Random;
import br.com.bytebank.modelo.*;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		//Forma literal de se criar um array
		//int[] refs = {1,2,3,4,5};
		
		for(int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]); 
		}
		
		for (int j = 0; j < contas.length; j++) {
			Random numeroRandom = new Random(); 
			int agencia = numeroRandom.nextInt(9999);
			int numero = numeroRandom.nextInt(999999);
			contas[j] = new ContaCorrente(agencia, numero);
		}
				
		for(int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]); 
			
			//Saida formatada, double com duas casas decimais
			System.out.printf("Saldo = %.2f \n", contas[i].getSaldo());
		}
		
	}

}
