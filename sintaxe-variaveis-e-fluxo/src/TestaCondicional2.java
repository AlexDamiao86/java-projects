
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 15;
		int quantidadePessoas = 3;
		
		boolean acompanhado = quantidadePessoas > 1;
	
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		//= atribui
		//== compara
		
		if (idade >= 18 || acompanhado) {
		//if (idade >= 18 && acompanhado) {
		//if (idade >= 18 && quantidadePessoas > 1) {
		//if (idade >= 18 || quantidadePessoas > 1) {
			System.out.println("Seja Bem-vindo!");
		} else {
			System.out.println("Infelizmente você não poderá entrar..");
		}
	}
}
