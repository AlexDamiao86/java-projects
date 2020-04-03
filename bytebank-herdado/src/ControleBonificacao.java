
public class ControleBonificacao {
	
	private double soma; 
	
	//Acontece polimorfismo em Funcionario f pois 
	//f poderá receber objeto das classes Gerente, EditorVideo,
	//Designer, Administrador, etc.
	//Todas subclasses da superclasse Funcionario. 
	
	public void registra(Funcionario f) {
		this.soma = this.soma + f.getBonificacao();
	}
	
	
	// Nao eh necessario o codigo "replicado" abaixo devido
	// ser possivel a solução através do polimorfismo
	/*
	public void registra(Gerente g) {
		this.soma = this.soma + g.getBonificacao();
	}
	
	public void registra(EditorVideo ev) {
		this.soma = this.soma + ev.getBonificacao();
	}
	*/
	
	public double getSoma() {
		return soma;
	}
}
