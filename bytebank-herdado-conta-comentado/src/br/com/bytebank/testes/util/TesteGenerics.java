package br.com.bytebank.testes.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteGenerics {
	
	public static void main(String[] args) {
		
		//Está determinado agora que todas as referencias da lista serão da classe Conta
		//Generics  = <Conta> 
		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaPoupanca cc2 = new ContaPoupanca(222, 555);
		
								//Posicoes
		lista.add(cc1); 		//0
		lista.add(cc2); 		//1
		lista.add(null);		//2
		
		System.out.println("Tamanho = " + lista.size());
		
		String nomeClasse = lista.get(0).getClass().getSimpleName(); 
		System.out.println(nomeClasse);
				
		//Como agora está determinado a Classe que as referencias utilizarão poderá se iterar
		//pela propria classe Conta invés da classe Object
		//Comparar com TesteArrayLista.java
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
