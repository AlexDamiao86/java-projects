package bytebank;

public class Conta {
	double saldo; 
	int agencia; 
	int numero; 
	String titular;
	
	//Todos os atributos numericos (double e int) são inicializados com 0
	//Inicialização de atributos numericos com valor diferente de 0
	//double saldo = 100; 

	//É possível inicializar atributos alfanumericos
	//String titular = "Fulano"; 

	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor; 
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor; 
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);	
			return true;
		} else {
			return false;
		}
	}
	
}
