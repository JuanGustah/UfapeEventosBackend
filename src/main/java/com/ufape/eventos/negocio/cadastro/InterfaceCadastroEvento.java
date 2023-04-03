package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Evento;

public interface InterfaceCadastroEvento {

	List<Evento> procurarEventoNome(String nome);

	Evento procurarEventoId(long id);

	List<Evento> listarEventos();

	void deletarEventoId(Long id);

	Evento salvarEvento(Evento evento);
}