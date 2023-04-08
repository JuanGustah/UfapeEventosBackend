package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class AgenciaEventos extends Agencia {
	@OneToMany
	private List<Administrador> administradores = new ArrayList<Administrador>();

	public List<Administrador> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}

}