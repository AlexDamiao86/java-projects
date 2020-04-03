
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Seja Bem-vindo!");
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Você pode entrar pois está acompanhado");
				System.out.println("Seja Bem-vindo!");
			} else {
				System.out.println("Infelizmente você não poderá entrar..");
			}
		}
	}
}
