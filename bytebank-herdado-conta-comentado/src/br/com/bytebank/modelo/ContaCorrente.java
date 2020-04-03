package br.com.bytebank.modelo;

/**
 * Classe ContaCorrente é subclasse da classe Conta (Herança)
 * Esta classe também implementa Tributavel e AutoCloseable. 
 * 
 * Tributavel é uma interface que determina que a classe que a 
 * implementa deverá possuir a implementação do método 
 * getValorImposto. 
 * 
 * AutoCloseable é uma interface que exige que a classe 
 * implemente o método close() para finalizar o objeto em caso 
 * de tratamento de exceção através de try-with-resources. 
 * 
 * @author alexandremaia
 * @version 1.0
 */

public class ContaCorrente extends Conta implements Tributavel, AutoCloseable {
	
	/**
	 * Construtor ContaCorrente utiliza o mesmo construtor 
	 * da superclasse Conta. Como uma subclasse de Conta, onde 
	 * a superclasse definiu construtor diferente do default, fez-se 
	 * necessária a declaração explícita do construtor para 
	 * ContaPoupanca. Foi utilizado inclusive a instrução super 
	 * para reaproveitar o construtor da classe-mãe. 
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	/**
	 * O método saca da superclasse Conta é sobrescrito para 
	 * adicionar regra de negócio que diz que será cobrada tarifa 
	 * de R$ 0,20 por cada transação de saque realizada pelo 
	 * cliente. 
	 * 
	 * Como o método saca da superclasse poderá retornar o erro
	 * SaldoInsuficienteException quando o cliente não possuir saldo
	 * suficiente para saque do valor desejado foi necessário o 
	 * tratamento deste exceção. (throws SaldoInsuficienteException)
	 * significa que a exceção será jogada na pilha e deverá 
	 * ser tratada pela classe chamadora (try..catch). 
	 */
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorComTarifa = valor + 0.2;
		super.saca(valorComTarifa);
	}

	/**
	 * Para a classe ContaCorrente é necessária a implementação 
	 * do método getValorImposto pois essa classe implementa a 
	 * interface Tributavel que exige isso. 
	 */
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public void close() {
		System.out.println("Encerra ContaCorrente");
	}
	
//	/**
//	 * Apenas um teste para confirmar que a classe Object sempre é herdada por uma outra classe
//	 * no Java. Será realizada uma SOBRESCRITA do método toString() da classe Object.  
//	 * A partir de agora se for informado um objeto da classe ContaCorrente como parâmetro para 
//	 * o método println() da classe System será devolvido o texto definido abaixo.  
//	 */
//  IMPLEMENTADO GENERICAMENTE NA CLASSE CONTA
//	@Override
//	public String toString() {
//		return "ContaCorrente, Agencia " + super.getAgencia() + " / Numero " + super.getNumero();
//	}
	
}
