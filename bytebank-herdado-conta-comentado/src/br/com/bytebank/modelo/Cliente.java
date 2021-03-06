package br.com.bytebank.modelo;

import java.io.Serializable;

/**
 * Classe Cliente Bytebank possui dados basicos do cliente
 * Possui apenas construtor default - 
 * Para instanciação do objeto utilizar  = new Cliente(); 
 * Todos os seus atributos são privados e a única forma de acesso
 * a eles é através de setters and getters. 
 *
 * @author alexandremaia
 * @version 1.0
 */
public class Cliente implements Serializable {
	
	private String nome = ""; 
	private String cpf = ""; 
	private String profissao = "";
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	} 
	
}
