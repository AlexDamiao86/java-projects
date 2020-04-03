package br.com.bytebank.testes;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.GuardadorDeContas;

public class TesteAdapterArrays {
	
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		ContaPoupanca cc2 = new ContaPoupanca(222, 555);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		ContaCorrente ref = (ContaCorrente) guardador.getConta(0);
		System.out.println(ref.getValorImposto());
	}

}
