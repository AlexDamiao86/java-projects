
public class TestaReferencias {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		//Funcionario g1 = new Gerente();
		//Funciona de modo semelhante a chamada por referência Gerente
		g1.setNome("Alexandre");
		g1.setSalario(5000.00);
		//ATENÇÃO: Porém, o Gerente com referência a funcionário 
		//não conseguirá utilizar o método Autentica. Veja que não 
		//é possível utilizar o método setSenha() quando objeto 
		//instanciado com referencia a Funcionário. 
		g1.setSenha(4444);
		
		//EditorVideo ev1 = new EditorVideo();
		Funcionario ev1 = new EditorVideo();
		ev1.setSalario(2500.00);

		//Designer d1 = new Designer(); 
		Funcionario d1 = new Designer();
		d1.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());

	}

}
