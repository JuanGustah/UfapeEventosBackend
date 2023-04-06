package com.ufape.eventos.negocio.basica;

public class DataIngressoJaPassouException extends Exception {
	public DataIngressoJaPassouException() {
		super("O seu ingresso se expirou.");
	}
}
