package com.ufape.eventos.negocio.basica;

public class IngressoNaoEncontradoException extends Exception {
	public IngressoNaoEncontradoException() {
		super("O ingresso não foi encontrado.");
	}
}
