package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;

public class Imprensario extends Usuario {
	
	List <Ingresso> ingressos = new ArrayList<Ingresso>();

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
	
}
