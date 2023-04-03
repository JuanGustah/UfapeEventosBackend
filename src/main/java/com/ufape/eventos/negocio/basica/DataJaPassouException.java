package com.ufape.eventos.negocio.basica;

public class DataJaPassouException extends Exception{
	public DataJaPassouException() {
		super("Data inserida está anterior a data atual.");
	}
}
