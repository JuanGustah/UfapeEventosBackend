package com.ufape.eventos.negocio.basica;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Atividade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String localReferencia;
	private String assunto;
	private String atracao;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	
	public Atividade(){}
	
	public long getCodigo() {
		return id;
	}
	public void setCodigo(long id) {
		this.id = id;
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
