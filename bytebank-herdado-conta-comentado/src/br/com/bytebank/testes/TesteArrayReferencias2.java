package br.com.bytebank.testes;

import br.com.bytebank.modelo.*;

public class TesteArrayReferencias2 {
	
	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(591, 2222);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(591, 3333);
		contas[1] = cc2; 
		
		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; 
		//Cast de uma referencia de tipo mais generico
		//para uma de tipo mais especifico
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
