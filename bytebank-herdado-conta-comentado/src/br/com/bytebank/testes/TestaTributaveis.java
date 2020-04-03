package br.com.bytebank.testes;

import br.com.bytebank.modelo.CalculadorImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;


public class TestaTributaveis {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(5191, 44444);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida(); 
		
		CalculadorImposto calc = new CalculadorImposto(); 
		calc.registra(cc);
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());
		
	}
}
