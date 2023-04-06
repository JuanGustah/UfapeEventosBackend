package com.ufape.eventos.negocio.basica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class EventoTest {

	@Test
	void testeSetData() {
		Evento evento = new Evento();
		String oldstring = "2011-01-18";
		
		try {
			Date dateUltrapassada = new SimpleDateFormat("yyyy-MM-dd").parse(oldstring);
			
			evento.setData(dateUltrapassada);
			fail("Não deveria atualizar com data desatualizada.");
		} catch (ParseException e) {
			fail("Erro de conversão de data.");
		} catch (DataJaPassouException e) {
			assertEquals(evento.getData(),null);
		}
	}
}
