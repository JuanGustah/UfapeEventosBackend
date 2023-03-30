package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
	private long id;
	private String nome;
	private int qtdTotalIngressos;
	private Date data;
	private Endereco endereco;
	private List<MaximoPorTipo> quantidadesMaximasPorTipo = new ArrayList<MaximoPorTipo>();
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
