
//Gerente herda da classe Funcionario, 
//		  assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	//Realiza composição para reutilizar código de AutenticacaoUtil
	//na implementação da interface Autenticavel
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando método de bonificação Gerente");
		return super.getSalario();
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
