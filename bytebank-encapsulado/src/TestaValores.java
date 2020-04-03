
public class TestaValores {
	
	public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.setNome("Alexandre");
		Conta conta = new Conta(5191, 434149, alexandre); 
		
		conta.deposita(-100); //Valor negativo deve ser proibido
		System.out.println(conta.getSaldo());
		
		Cliente andreia = new Cliente();
		Conta conta2 = new Conta(0, 434149, andreia); 
		
		conta2.deposita(100);
		System.out.println(conta2.getNumero());
		System.out.println(Conta.getTotal());
		
	}

}
