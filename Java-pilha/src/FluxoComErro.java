
public class FluxoComErro {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			System.out.println("Exception " + ex.getMessage());
			ex.printStackTrace(); // Mostra onde está ocorrendo o erro
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception2");
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");

		metodo2();

		System.out.println("Fim do metodo2");
	}
}
