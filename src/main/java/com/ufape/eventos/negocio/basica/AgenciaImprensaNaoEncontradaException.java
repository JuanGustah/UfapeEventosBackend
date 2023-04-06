package com.ufape.eventos.negocio.basica;

public class AgenciaImprensaNaoEncontradaException extends Exception {
	public AgenciaImprensaNaoEncontradaException() {
		super("Agencia de imprensa não encontrada.");
	}
}
