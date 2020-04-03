//Classe abstrata nao poderah ser instanciada
public abstract class Funcionario {
	
	private String nome; 
	private String cpf; 
	private double salario; 
	
//  Conforme regra nao existirah Bonificacao generica, apenas para Classes especificas	
//	public double getBonificacao() {
//		System.out.println("Chamando método de bonificação Funcionário");
//		return this.salario * 0.05;
//	}
	
	//Metodo abstrato nao possui corpo de implementação
	//Isso obriga a toda classe concreta filha de Funcionario implementar esse metodo
	protected abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
