package br.com.bytebank.testes;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TestaObject {

	public static void main(String[] args) {

		// O método println() da classe System possui sobrecarga, pois recebe diferentes 
		// parâmetros para retorno de resultado.
//		System.out.println("X");
//		System.out.println(3);
//		System.out.println(false);

		Conta cc = new ContaCorrente(222, 3333);
		ContaPoupanca cp = new ContaPoupanca(4444, 5555);
		Cliente cliente  = new Cliente();
		
		/* 
		 * Observação: Se a referencia cc for da classe Object, somente os métodos da classe Object
		 * estarão visíveis. Se a referencia cc for da classe Conta (superclasse) da classe 
		 * ContaCorrente, estarão visíveis os métodos da classe Conta e Object, mas não os métodos
		 * específicos da classe ContaCorrente. No entanto, se a referencia cc for da classe 
		 * ContaCorrente estarão visíveis os métodos da classe Conta, Object e ContaCorrente. 
		 * Ou seja, se tornam vísiveis os métodos da classe atual e superior a ela na hierarquia.
		 */
		cc.deposita(100);
		try {
			cc.saca(70); //O compilador entende que deve-se retirar R$0,20 de tarifa por mais 
						 //que a referencia seja atraves da classe Conta. 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cc.getSaldo());
		//método apenas visível quando referenciado classe ContaCorrente
//		System.out.println(cc.getValorImposto()); 
		
		String teste = cc.toString();
		System.out.println(teste);
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(cliente);

	}

//	
//	 As várias versões do método println() aqui são chamadas de sobrecarga de método, 
//	 não confundir com sobrescrita de método que é um conceito relacionado com herança. 
//	 
	static void println() {

	}

	static void println(int numero) {

	}

	static void println(boolean bool) {

	}

	/**
	 * O parâmetro da classe Object permite que um objeto de uma classe não
	 * determinada utilize esse método, assim como acontece no método println da Classe System
	 * quando se informa como parâmetro do método objetos de classes variadas. 
	 * 
	 * Todas as classes mães do Java extendem a classe Object por mais que isso não esteja
	 * explicitamente declarado na definição da Classe. 
	 * 
	 * @param objeto
	 */
	static void println(Object referencia) {

	}
}
