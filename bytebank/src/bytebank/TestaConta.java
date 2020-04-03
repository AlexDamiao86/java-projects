package bytebank;

public class TestaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200; 
		primeiraConta.agencia = 5191; 
		primeiraConta.numero = 10000; 
		primeiraConta.titular = "Alexandre";
		
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println("Titular da primeira conta é " + primeiraConta.titular);
		System.out.println("Titular da segunda conta é " + segundaConta.titular);
	}
}
