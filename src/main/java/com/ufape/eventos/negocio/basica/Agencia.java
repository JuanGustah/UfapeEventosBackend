package com.ufape.eventos.negocio.basica;

public abstract class Agencia {
	
	private long id;
	private String nome;
	private String cnpj;
	
	
	public Agencia() {}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}