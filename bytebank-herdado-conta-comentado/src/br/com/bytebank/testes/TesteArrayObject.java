package br.com.bytebank.testes;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrayObject {
	
	public static void main(String[] args) {
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(591, 2222);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(591, 3333);
		referencias[1] = cc2; 
		
		Cliente cliente = new Cliente(); 
		referencias[2] = cliente;
		
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; 
		//Cast de uma referencia de tipo mais generico
		//para uma de tipo mais especifico
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
