
public class TesteConexao {

	public static void main(String[] args) {

		
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro em Conexão!!");
		}
		
		//-----------------------------------------
		//Substituiu codigo abaixo:
		//-----------------------------------------
		/*
		Conexao con = null;

		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro em Conexão!");
		} finally { // Sempre será executado, com ou sem erro
			if (con != null) {
				con.fecha();
			}
		}
		*/
	}

}
