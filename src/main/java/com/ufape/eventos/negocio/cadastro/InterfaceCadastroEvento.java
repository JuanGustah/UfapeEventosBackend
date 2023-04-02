package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Evento;

public interface InterfaceCadastroEvento {

	List<Evento> procurarClienteNome(String nome);

	Evento procurarClienteId(long id);

	List<Evento> listarClientes();

	void deletarClienteId(Long id);

	Evento salvarCliente(Evento evento);

	void deletarCliente(Evento cliente);

}