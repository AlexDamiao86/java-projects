
public class TesteFuncionario {
	
	public static void main(String[] args) {
		Gerente alexandre = new Gerente();
		alexandre.setNome("Alexandre Maia");
		alexandre.setCpf("123.345.567-78");
		alexandre.setSalario(3000);
		
		System.out.println(alexandre.getNome());
		System.out.println(alexandre.getBonificacao());

	}

}
