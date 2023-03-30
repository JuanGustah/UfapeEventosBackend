package com.ufape.eventos.negocio.basica;

import java.time.LocalTime;

public class Atividade {
	private long codigo;
	private String localReferencia;
	private String assunto;
	private String atracao;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	
	public Atividade(){}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getLocalReferencia() {
		return localReferencia;
	}
	public void setLocalReferencia(String localReferencia) {
		this.localReferencia = localReferencia;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getAtracao() {
		return atracao;
	}
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}
	
	
}
