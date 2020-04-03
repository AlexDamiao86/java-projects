package br.com.bytebank.modelo;

public class GuardadorDeObjetos {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeObjetos() {
		referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
