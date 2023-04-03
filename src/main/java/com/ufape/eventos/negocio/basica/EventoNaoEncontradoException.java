package com.ufape.eventos.negocio.basica;

public class EventoNaoEncontradoException extends Exception {
	public EventoNaoEncontradoException() {
		super("Evento não encontrado.");
	}
}
