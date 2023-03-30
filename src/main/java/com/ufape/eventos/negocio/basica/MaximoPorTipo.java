package com.ufape.eventos.negocio.basica;

public class MaximoPorTipo {
	private long id;
	private int qtdMaxima;
	private String tipo;
	
	public MaximoPorTipo() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
