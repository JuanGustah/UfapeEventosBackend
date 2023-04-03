package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Evento;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;

public interface InterfaceCadastroEvento {

	List<Evento> procurarEventoNome(String nome);

	Evento procurarEventoId(long id) throws EventoNaoEncontradoException;

	List<Evento> listarEventos();

	void deletarEventoId(Long id);

	Evento salvarEvento(Evento evento) throws DataJaPassouException;
	
	Evento atualizarEvento(Evento evento);
}