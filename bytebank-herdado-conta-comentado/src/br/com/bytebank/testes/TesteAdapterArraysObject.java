package br.com.bytebank.testes;

import br.com.bytebank.modelo.*;

public class TesteAdapterArraysObject {
	
	public static void main(String[] args) {
		
		/**
		 * objetos faz referencia a uma classe que armazena referencias de classes diversas
		 */
		GuardadorDeObjetos objetos = new GuardadorDeObjetos();
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaPoupanca cc2 = new ContaPoupanca(222, 555);
		Cliente cliente = new Cliente(); 
		cliente.setNome("Alexandre");
		SeguroDeVida seguro = new SeguroDeVida(); 
		
		objetos.adiciona(cc1);
		objetos.adiciona(cc2);
		objetos.adiciona(cliente);
		objetos.adiciona(null);
		objetos.adiciona(args);
		objetos.adiciona(seguro);
		
		System.out.println(objetos.getQuantidadeElementos());
		
		ContaCorrente ref = (ContaCorrente) objetos.getReferencia(0);
		System.out.println(ref.getNumero());
		
		Cliente ref2 = (Cliente) objetos.getReferencia(2);
		System.out.println(ref2.getNome());
	}

}
