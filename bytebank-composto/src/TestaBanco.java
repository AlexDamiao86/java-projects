
public class TestaBanco {

	public static void main(String[] args) {
		//Referencia e Classe Cliente
		Cliente paulo = new Cliente(); 
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaPaulo = new Conta(); 
		contaPaulo.deposita(100);
		
		//Associa o cliente Paulo a contaPaulo
		contaPaulo.titular = paulo;
		
		System.out.println(contaPaulo.titular);
		System.out.println(contaPaulo.titular.nome);
		System.out.println(contaPaulo.titular.cpf);
				
	}
}
