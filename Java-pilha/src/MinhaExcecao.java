
//public class MinhaExcecao extends RuntimeException { //Assinatura Unchecked 
public class MinhaExcecao extends Exception { //Assinatura Checked
	
	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}

}
