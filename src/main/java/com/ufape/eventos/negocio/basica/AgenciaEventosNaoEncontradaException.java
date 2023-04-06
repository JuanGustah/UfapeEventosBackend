package com.ufape.eventos.negocio.basica;

public class AgenciaEventosNaoEncontradaException extends Exception {
	public AgenciaEventosNaoEncontradaException() {
		super("Agencia de eventos não encontrada.");
	}
}
