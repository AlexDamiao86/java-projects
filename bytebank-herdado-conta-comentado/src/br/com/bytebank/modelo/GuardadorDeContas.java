package br.com.bytebank.modelo;

public class GuardadorDeContas {
	
	private Conta[] contas;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		contas = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta c) {
		contas[this.posicaoLivre] = c;
		this.posicaoLivre++;
	}
	
	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Conta getConta(int pos) {
		return this.contas[pos];
	}

}
