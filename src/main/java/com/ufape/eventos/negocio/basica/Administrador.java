package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;

@Entity
public class Administrador extends Usuario {

	private List<Evento> eventos = new ArrayList<Evento>();
		
	public List<Evento> getEventos(){
		return eventos;
	}
	
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
