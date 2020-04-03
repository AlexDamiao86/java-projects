
public class TestaGerente {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente(); 
		g1.setNome("Alexandre Maia");
		g1.setSalario(4000);
		g1.setCpf("001.112.233-98");
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao()); 
		
		g1.setSenha(2222);
		boolean autenticaOK = g1.autentica(2222);
		System.out.println(autenticaOK);

	}

}
