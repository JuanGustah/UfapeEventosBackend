package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class AgenciaImprensa extends Agencia {
	@OneToMany
	private List<Imprensario> imprensarios = new ArrayList<Imprensario>();

	public List<Imprensario> getImprensarios() {
		return imprensarios;
	}

	public void setImprensarios(List<Imprensario> imprensarios) {
		this.imprensarios = imprensarios;
	}
	
}