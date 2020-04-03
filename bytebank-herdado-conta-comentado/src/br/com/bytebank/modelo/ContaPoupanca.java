package br.com.bytebank.modelo;


/**
 * A classe ContaPoupanca herda de Conta seus metodos public ou
 * protected. Como uma subclasse de Conta, onde superclasse definiu
 * construtor diferente do default e sem implementação do construtor
 * default, fez-se necessário a declaração explícita do construtor
 * para ContaPoupanca. Foi utilizado inclusive a instrução super
 * para reaproveitar o construtor da classe-mãe. 
 * 
 * @author alexandremaia
 * @version 1.0
 */
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

//	/**
//	 * Apenas um teste para confirmar que a classe Object sempre é herdada por uma outra classe
//	 * no Java. Será realizada uma SOBRESCRITA do método toString() da classe Object.  
//	 * A partir de agora se for informado um objeto da classe ContaPoupanca como parâmetro para 
//	 * o método println() da classe System será devolvido o texto definido abaixo.  
//	 */
//  IMPLEMENTADO GENERICAMENTE NA CLASSE CONTA
//	@Override
//	public String toString() {
//		return "ContaCorrente, Agencia " + super.getAgencia() + " / Numero " + super.getNumero();
//	}
	
}
