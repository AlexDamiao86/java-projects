package br.com.alura.biblioteca;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TestaBiblioteca {
	
	public static void main(String[] args) {
	
		Conta cc = new ContaCorrente(123, 321);
		
		cc.deposita(200);
		
		System.out.println(cc.getSaldo());
	}

}
