
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total; //Contar quantos objetos foram instanciados


	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		
		System.out.println("Criando uma nova conta..");
		this.agencia = agencia; 
		this.numero = numero; 
	}
	
	public Conta(int agencia, int numero, Cliente titular) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		
		/*
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agência/Conta informada inválida..");
			return;
		}
		if (titular == null) {
			System.out.println("Cliente informado inválido..");
			return;
		}
		*/
		System.out.println("Criando uma nova conta..");
		this.agencia = agencia; 
		this.numero = numero; 
		this.titular = titular;
		/*
		System.out.println("Criada conta " + this.getNumero() + 
				" na agência " + this.getAgencia() +
				" para o cliente " + this.getTitular().getNome());
		*/
	}
	
	public void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("Valor informado deposito inválido..");
			return;
		}
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (valor <= 0) {
			System.out.println("Valor informado saque inválido..");
			return false;
		}
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (valor <= 0) {
			System.out.println("Valor informado transferência inválido..");
			return false;
		}
		if (destino == null) {
			System.out.println("Conta informada inválida..");
			return false;
		}
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean setAgenciaConta(int novaAgencia, int novoNumero) {
		if (novaAgencia <= 0 || novoNumero <= 0) {
			System.out.println("Agência/Conta informada inválida..");
			return false;
		}
		if (this.agencia == novaAgencia && this.numero == novoNumero) {
			System.out.println("Conta informada é a mesma");
			return false;
		}

		this.agencia = novaAgencia;
		this.numero = novoNumero;
		return true;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean setTitular(Cliente cliente) {
		if (this.titular == cliente) {
			System.out.println("Titular informado é o mesmo");
			return false;
		}

		this.titular = cliente;
		return true;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() { //Metodo da classe
		return Conta.total; 
		//Aqui nao funciona o this pois este refere-se ao objeto
	}
}
