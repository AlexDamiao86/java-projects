
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaAlexandre = new Conta();
		
		contaAlexandre.deposita(100);
		
		/*
		System.out.println(contaAlexandre.titular); //devolve null
		System.out.println(contaAlexandre.titular.nome); //retorna erro de execucao NullPointerException
		*/
		
		//Uma forma alternativa para associar Conta e Cliente
		contaAlexandre.titular = new Cliente();
		contaAlexandre.titular.nome = "Alexandre Maia";
		
		System.out.println(contaAlexandre.titular);
		System.out.println(contaAlexandre.titular.nome);
	}
}
