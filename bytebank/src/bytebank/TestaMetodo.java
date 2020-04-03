package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaAlexandre = new Conta();
		
		contaAlexandre.deposita(500);
		
		System.out.println(contaAlexandre.saldo);
		
		boolean sucessoSaque = contaAlexandre.saca(150);
		
		if (sucessoSaque) {
			System.out.println(contaAlexandre.saldo);
		} else {
			System.out.println("Saldo insuficiente para valor solicitado..");
			System.out.println("Saldo atual = " + contaAlexandre.saldo);
		}
		
		Conta contaMarcelo = new Conta(); 
		contaMarcelo.deposita(1500);
		boolean sucessoTransferencia = 
				contaMarcelo.transfere(300, contaAlexandre);
			
		if (sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
			System.out.println("Novo saldo = " + contaMarcelo.saldo);
		} else {
			System.out.println("Saldo insuficiente para valor solicitado..");
			System.out.println("Saldo atual = " + contaMarcelo.saldo);
		}
		
		System.out.println(contaAlexandre.saldo);
		
		
	}

}
