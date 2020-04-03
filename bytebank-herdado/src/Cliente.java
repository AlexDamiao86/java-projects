
public class Cliente implements Autenticavel {

	//Realiza composição para reutilizar código de AutenticacaoUtil
	//na implementação da interface Autenticavel
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
