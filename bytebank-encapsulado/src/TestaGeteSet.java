
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta(7777, 4444, null); //nao bloqueou a criacao do objeto
		
		boolean sucessoSET = conta.setAgenciaConta(5191, 434149);
		
		sucessoSET = conta.setAgenciaConta(8888, 434149);
		
		if (sucessoSET) {
			System.out.println("Nova Agencia: " + conta.getAgencia() + 
					" / Nova Conta: " + conta.getNumero());
		}
		
		Cliente alexandre = new Cliente();
		//Display no endereco onde esta o Cliente alexandre	
		System.out.println(alexandre);
		alexandre.setNome("Alexandre");
		alexandre.setProfissao("Analista de sistemas");
		
		//Associa o Cliente alexandre a Conta conta
		conta.setTitular(alexandre);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		System.out.println(alexandre.getNome());
		
		//Alterando a profissão cliente atraves da conta
		conta.getTitular().setProfissao("Programador");
		
		//Agora em mais de uma linha a mesma alteração
		Cliente titularConta = conta.getTitular(); 
		titularConta.setProfissao("Chef de cozinha");
		
		System.out.println(conta.getTitular().getProfissao());

	}
}
