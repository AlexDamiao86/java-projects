
public class SistemaInterno {

	private int senha = 2222; 
	
	//Implementa polimorfismo da interface Autenticavel. 
	//'a' poderá receber qualquer objeto de classe que implementa 
	//a interface Autenticavel. 
	public String autentica(Autenticavel a) {
		if (a.autentica(this.senha)) {
			return "Pode entrar no sistema interno!";
		} else {
			return "Não pode entrar no sistema interno..";
		}
	}
	
}
