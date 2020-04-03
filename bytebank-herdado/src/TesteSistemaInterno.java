
public class TesteSistemaInterno {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		
		System.out.println("+++ Gerente +++");
		Gerente g = new Gerente();
	    g.setSenha(8888);
	    boolean autenticaSucesso = g.autentica(8888);
		
		if (autenticaSucesso) {
			System.out.println("Usuario logado");
		    g.setSenha(2222);
			System.out.println(si.autentica(g));
		} else {
			System.out.println("Usuario não logado");
		};
		
		System.out.println("+++ Administrador +++");
		Administrador as = new Administrador();
		as.setSenha(2222);
		autenticaSucesso = as.autentica(2222);
		
		if (autenticaSucesso) {
			System.out.println("Usuario logado");
			System.out.println(si.autentica(as));
		} else {
			System.out.println("Usuario não logado");
		};
		
		System.out.println("+++ Cliente ++++");
		Cliente c = new Cliente();
		c.setSenha(2222);
		autenticaSucesso = c.autentica(9999);
		
		if (autenticaSucesso) {
			System.out.println("Usuario logado");
			System.out.println(si.autentica(c));
		} else {
			System.out.println("Usuario não logado");

		};

	}
	
}
