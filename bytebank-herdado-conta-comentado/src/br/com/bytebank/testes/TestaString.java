package br.com.bytebank.testes;


public class TestaString {

	public static void main(String[] args) {
		String nome = "Alexandre"; //Nome é uma referencia da classe String
								   //"Alexandre" é um object literal e é imutável
		nome.replace("A", "a");    //O método replace devolve uma string e não altera 
								   //o conteúdo de "Alexandre"
		System.out.println(nome);
		
		String nomeAlterado = nome.replace("A", "a");
		System.out.println(nomeAlterado);
		
		nomeAlterado = nomeAlterado.replace("a", "A");
		System.out.println(nomeAlterado);
		
		nomeAlterado = nome.toUpperCase();
		System.out.println(nomeAlterado);
		
		nomeAlterado = nome.toLowerCase();
		System.out.println(nomeAlterado);
		
		int  x = 3;
		char C = nome.charAt(x);
		System.out.println((x+1) + "a letra do nome é " + C);
		
		x = nome.indexOf("sc");
		System.out.println("Posicao sc " + (x+1));
		x = nome.indexOf("dr");
		System.out.println("Posicao dr " + (x+1));
		
		String sub = nome.substring(x);
		System.out.println("A partir da posicao " + (x+1) + " é " + sub);
		
		sub = nome.substring(1, 3); 
		System.out.println("Entre a posicao 2 e 4 " + sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = "  ar  ";
		vazio = vazio.trim(); //Retira os espacos em branco no inicio e fim da string
		boolean ehVazio = vazio.isEmpty();
		System.out.println(ehVazio);
		
		if (!ehVazio) {
			System.out.println("Não é vazio!!");
			if (vazio.contains("ar")) {
				System.out.println("Contém sequência de caracteres procurada!");
			} else {
				System.out.println("Não contém sequência de caracteres procurada..");
			}
		}
		
		
		//ATENÇÃO: O BB adota essa Classe para strings
		
		StringBuffer texto = new StringBuffer(); 
		
		texto.insert(0, "Mensagem de texto");
		texto.append(" Mais um");
		texto.deleteCharAt(0);
		
		System.out.println(texto);

		texto.delete(0, texto.length());
		System.out.println(texto);
	}

}
