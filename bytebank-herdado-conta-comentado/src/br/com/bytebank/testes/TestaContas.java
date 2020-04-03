package br.com.bytebank.testes;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		
		/**
		 * Try-with-resources
		 * Para sua utilização a classe para qual se deseja instanciar
		 * um objeto deverá implementar a interface AutoCloseable. 
		 * Quer dizer que o código contido no bloco try será 
		 * executado apenas se for possível instanciar objeto cc com 
		 * sucesso. Se não for possível instanciar o objeto, 
		 * será chamado o método close() implementado na classe 
		 * ContaCorrente devido a interface AutoCloseable.
		 * No fim com sucesso ou sem sucesso de try-with-resources, 
		 * o método close() também será chamado ainda que não exista 
		 * instrução try..catch..finally.  
		 */
		try (ContaCorrente cc = new ContaCorrente(8888, 111)) {
			cc.deposita(100);			
			cc.deposita(200);
			System.out.println(cc.getSaldo());
			
			ContaPoupanca cp = new ContaPoupanca(1111, 222);
			cp.deposita(200);
			
			cc.transfere(10, cp);
			cp.transfere(10, cc);
			
			cc.saca(50);
			
			System.out.println("CC = " + cc.getSaldo());
			System.out.println("CP = " + cp.getSaldo());
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	/*	
	 *  Conteúdo anterior do código antes do teste de 
	 *  try-with-resources
	 *  
	    ContaCorrente cc = new ContaCorrente(8888, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(100);			
		cc.deposita(200);
		System.out.println(cc.getSaldo());
			
		cp.deposita(200);
		
		cc.transfere(10, cp);
		cp.transfere(10, cc);
		
		System.out.println("CC = " + cc.getSaldo());
		System.out.println("CP = " + cp.getSaldo());
	*/

	}

}
