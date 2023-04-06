package com.ufape.eventos.negocio.fachada;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ufape.eventos.negocio.basica.Atividade;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;

@SpringBootTest
public class IntegracaoTest {
	@Autowired
	GerenciadorEventos gerenciadorEventos;
	
	@Test
	void salvarAtividadeEmEventoInexistente() {
		Atividade atividade = new Atividade();
		
		try {
			gerenciadorEventos.salvarAtividade(atividade, (long) 1234);
			fail("Não deveria existir esse id de evento");
		} catch (EventoNaoEncontradoException e) {
			withSuccess();
		} catch (DataJaPassouException e) {
			fail("Não deveria poder alterar data no cadastro de atividade");
		}
	}
}
