
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace(); // Mostra onde está ocorrendo o erro
		}
		System.out.println("Fim do main");
	}

	//private static void metodo1() {
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException | MinhaExcecao ex) {
			System.out.println("Exception " + ex.getMessage());
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");

		// Primeira opção de implementacao
		// ArithmeticException exception = new ArithmeticException("Erro!!");
		// throw exception;
		// Segunda opção de implementaçao
		// throw new ArithmeticException("Deu errado!");
		
		throw new MinhaExcecao("Deu muito errado!!");

		// System.out.println("Fim do metodo2");
	}
}
