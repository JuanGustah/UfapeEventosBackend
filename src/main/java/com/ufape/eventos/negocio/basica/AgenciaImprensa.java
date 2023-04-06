package com.ufape.eventos.negocio.basica;

import java.util.ArrayList;
import java.util.List;

public class AgenciaImprensa extends Agencia {
	
	private List<Imprensario> imprensarios = new ArrayList<Imprensario>();

	public List<Imprensario> getImprensarios() {
		return imprensarios;
	}

	public void setImprensarios(List<Imprensario> imprensarios) {
		this.imprensarios = imprensarios;
	}
	
}