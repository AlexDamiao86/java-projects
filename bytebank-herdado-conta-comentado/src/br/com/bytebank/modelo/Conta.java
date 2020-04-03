package br.com.bytebank.modelo;

import java.io.Serializable;

/** 
 * Classe {@code Conta} é uma classe abstrata, ou seja, ela não 
 * poderá ser instanciada diretamente, mas poderá ser referenciada
 * na instanciação de objeto. <br><br>
 * 
 * {@code Conta x = new ContaCorrente(y, z);} 	(PERMITIDO)<br>
 * {@code Xpto  x = new Conta(y, z);} 			(NÁO PERMITIDO)<br><br>
 * 
 * Poderá ainda, ser utilizada como referencia em um método 
 * para realizar polimorfismo por ser uma superclasse, ou seja, 
 * classe-mãe em uma hierarquia de herança.
 * 
 * Como possui modificador {@code public}, esta Classe poderá ser vista 
 * por outras classes dentro deste pacote E por classes dentro de 
 * outros pacotes desde que utilizado o comando {@code import} para 
 * utilizá-la. <br><br>
 * 
 * Em alguns pontos, essa classe jogará na pilha de execução a 
 * exceção {@code IllegalArgumentException}. Como essa exceção herda
 * de {@code RuntimeException}, ela é considerada como unchecked e o
 * compilador não realizará a verificação do tratamento da
 * exceção. <br><br>
 * 
 * Em alguns pontos, essa classe jogará na pilha de execução a 
 * exceção {@code SaldoInsuficienteException} que é considerada como uma 
 * exceção checked pois herda de {@code Exception}. Nesse caso a classe 
 * que utilizar os métodos que jogam essa exceção na pilha deverão
 * tratar a exceção através de {@code try..catch} ou ainda explicitar para 
 * um outro método da pilha de execução através da instrução 
 * {@code throws SaldoInsuficienteException} que ele deverá tratá-lo, assim
 * por diante. 
 * 
 * @author alexandremaia
 * @version 1.0
 *
 */

public abstract class Conta implements Comparable<Conta> , Serializable {
	/**
	 * O atributo saldo possui o modificador protected, o que 
	 * significa que ele poderá ser diretamente utilizado pela 
	 * própria classe Conta ou pelas classes filhas como public. 
	 * Este atributo não será visível por classes que não são 
	 * subclasses de Conta, nem a própria classe Conta. 
	 */
	protected double saldo;
	private int agencia;
	private int numero;
	// titular é um atributo que utiliza Composição,  
	// Composicao da classe Cliente. titular é um Cliente. 
	private Cliente titular;
	
	/**
	 * O modificador static do atributo total, indica que ele 
	 * é um atributo de classe, ou seja, não é inicializa um valor 
	 * para este atributo para cada objeto. Total armazenará a 
	 * quantidade de objetos Conta instanciados (incluindo 
	 * objetos instanciados pelas suas subclasses). 
	 */
	private static int total; 

	/**
	 * Construtor da classe Conta <br>
	 * Apesar dessa classe ser abstrata e não ser possível 
	 * instanciá-la diretamente. As suas subclasses deverão 
	 * instanciar os seus objetos dessa forma: <br>
	 * 
	 * {@code new ClasseFilha(agencia, numero);}
	 * 
	 * @param agencia = Código de dependencia na qual conta foi criada
	 * @param numero = Número da conta dentro da dependência 
	 */
	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException("Agência inválida");
		}
		
		if (numero < 1) {
			throw new IllegalArgumentException("Número da conta inválida");
		}
		
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		
		this.agencia = agencia; 
		this.numero = numero; 
		
		System.out.println("Nova conta criada..");
	}
	
	public void deposita(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor informado inválido para deposito..");
		}
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor informado inválido para saque..");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor + 
					", saldo atual " + this.saldo); 	
		}
		this.saldo = this.saldo - valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor informado inválido para transferência..");
		}
		if (destino == null) {
			throw new IllegalArgumentException("Conta destino inválida");
		}
		this.saca(valor);
		// Se houver alguma exceção no metodo saca,  
		// Essa exceção será jogada na pilha e interrompe-se a 
		// execução do presente método. 
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgenciaConta(int novaAgencia, int novoNumero) {
		if (novaAgencia < 1 ) {
			throw new IllegalArgumentException("Nova agência informada inválida..");
		}
		if (novoNumero < 1 ) {
			throw new IllegalArgumentException("Novo número da conta inválido..");
		}
		if (this.agencia == novaAgencia && this.numero == novoNumero) {
			throw new IllegalArgumentException("Conta informada é a mesma");
		}
		this.agencia = novaAgencia;
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setTitular(Cliente cliente) {
		if (this.titular == cliente) {
			throw new IllegalArgumentException("Titular informado é o mesmo");
		}
		this.titular = cliente;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	/**
	 * Este é um método público da classe Conta, ele retornará 
	 * o número de objetos Conta (incluso aí objetos instanciados
	 * pelas subclasses Conta). O que indica que é um método de 
	 * classe é o modificador static. 
	 * 
	 * Neste caso não poderia ser utilizado this, como foi 
	 * utilizado nos demais métodos que serão criados para o 
	 * objeto, pois se refere a um atributo static (da classe). 
	 * 
	 * @return Conta.total = Total de objetos instanciados
	 */
	public static int getTotal() {
		return Conta.total; 
	}
	
	/**
	 * Apenas um teste para confirmar que a classe Object sempre é herdada por uma outra classe
	 * no Java. Será realizada uma SOBRESCRITA do método toString() da classe Object.  
	 * A partir de agora se for informado um objeto da classe Conta como parâmetro para 
	 * o método println() da classe System será devolvido o texto definido abaixo.  
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ", Agencia " + this.getAgencia() + 
				" / Numero " + this.getNumero();
	}

	@Override
	public boolean equals(Object ref) {
		Conta conta = (Conta) ref;
		if (this.agencia == conta.agencia &&
		    this.numero  == conta.numero) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}
}
