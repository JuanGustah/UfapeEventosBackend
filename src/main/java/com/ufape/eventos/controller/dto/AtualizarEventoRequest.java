package com.ufape.eventos.controller.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ufape.eventos.negocio.basica.Endereco;

public class AtualizarEventoRequest {
	public String nome;
	private int qtdTotalIngressos;
	private Endereco endereco;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data;
	
	public AtualizarEventoRequest(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public int getQtdTotalIngressos() {
		return qtdTotalIngressos;
	}
	public Date getData() {
		return data;
	}
	public Endereco getEndereco() {
		return endereco;
	}
}
