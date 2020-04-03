package br.com.bytebank.modelo;

//public class SaldoInsuficienteException extends RuntimeException {

/**
 * A classe SaldoInsuficienteException quando herda de Exception 
 * torna-se uma exceção do tipo checked, ou seja, foi determinado
 * que o compilador deverá verificar o tratamento desta exceção nas
 * classes nas quais será utilizada. 
 * 
 * Caso a declaração fosse através de 'extends RuntimeException', 
 * esta exceção seria unchecked, ou seja, não seria verificado 
 * pelo compilador o tratamento desta exceção nas classes nas quais
 * será utilizada.  
 * 
 * @author alexandremaia
 * @version 1.0
 */
public class SaldoInsuficienteException extends Exception {
	
	/**
	 * Construtor da classe utiliza um dos construtores
	 * existentes na superclasse Exception. Como Exception tambem
	 * possui o construtor default implementado - public Exception()
	 * não seria obrigatorio a declaração de construtor explícito, 
	 * porém se preferiu utilizar construtor não padrão 
	 * para essa classe (que inclui mensagem de erro).
	 * 
	 * @param mensagem
	 */
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	} 
	
}
