package com.ufape.eventos.negocio.basica;

import java.util.Date;

public class Ingresso {
	
	private long id;
	private Date dataEmissao;
	private String tipo;
	
	
	public Ingresso() {}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
