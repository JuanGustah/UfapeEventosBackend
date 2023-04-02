package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private int qtdTotalIngressos;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@OneToMany
	private List<MaximoPorTipo> quantidadesMaximasPorTipo = new ArrayList<MaximoPorTipo>();
	
	@OneToMany
	private List<Atividade> atividades = new ArrayList<Atividade>();

	public Evento(){}

	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdTotalIngressos() {
		return qtdTotalIngressos;
	}
	public void setQtdTotalIngressos(int qtdTotalIngressos) {
		this.qtdTotalIngressos = qtdTotalIngressos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<MaximoPorTipo> getQuantidadesMaximasPorTipo() {
		return quantidadesMaximasPorTipo;
	}
	public void setQuantidadesMaximasPorTipo(List<MaximoPorTipo> quantidadesMaximasPorTipo) {
		this.quantidadesMaximasPorTipo = quantidadesMaximasPorTipo;
	}
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
}
