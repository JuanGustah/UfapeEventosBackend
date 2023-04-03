package com.ufape.eventos.negocio.basica;

public class AtividadeNaoEncontradaException extends Exception {
	public AtividadeNaoEncontradaException() {
		super("Atividade não encontrada.");
	}
}
