package br.com.bytebank.modelo;

/**
 * A classe CalculadorImposto foi implementada utilizando conceito
 * de polimorfismo para a interface Tributavel. Tributavel possui
 * como assinatura de método getValorImposto(); 
 * 
 * 
 * @author alexandremaia
 * @version 1.0
 */
public class CalculadorImposto {
	
	private double totalImposto; 
	
	/**
	 * Método registra fará somatória dos valores de impostos 
	 * Tributável t poderá ser qualquer objeto de classes que 
	 * implementam a interface Tributável (polimorfismo).  
	 * 
	 * @param t = objeto de classe que implementa a interface
	 * Tributável.  
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor; 
	}
	
	//Forma de acesso a informação totalImposto (GET)
	public double getTotalImposto() {
		return totalImposto;
	}

}
