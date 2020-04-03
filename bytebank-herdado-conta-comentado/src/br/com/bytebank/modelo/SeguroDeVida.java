package br.com.bytebank.modelo;

/**
 * A Classe SeguroDeVida implementa a interface Tributavel, o que 
 * significa que a classe deverá implementar todos os métodos 
 * abstratos contidos em Tributavel. 
 * 
 * Perceba que Seguro de Vida não é uma subclasse de Conta como
 * as classes ContaCorrente e ContaPoupanca.  
 *  
 * @author alexandremaia
 * @version 1.0
 */
public class SeguroDeVida implements Tributavel {

	/**
	 * Método getValorImposto sobrescrito a partir da assinatura
	 * de método encontrada em Tributavel. 
	 */
	@Override
	public double getValorImposto() {
		return 10;
	}
	

}
