package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEventos extends Agencia {
	
	private List<Administrador> administradores = new ArrayList<Administrador>();

	public List<Administrador> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}

}