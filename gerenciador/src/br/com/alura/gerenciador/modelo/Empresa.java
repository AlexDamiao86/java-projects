package br.com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {
	
	public static int ultimaId = 1; 
	
	private Integer id; 
	private String nome;
	private Date dataAbertura = new Date();
	
	public Empresa(String nome) {
		super();
		this.id = ultimaId++;
		this.nome = nome;
		
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	
}
