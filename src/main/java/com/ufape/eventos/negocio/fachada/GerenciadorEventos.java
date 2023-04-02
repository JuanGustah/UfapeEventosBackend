package com.ufape.eventos.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.negocio.basica.Evento;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroEvento;

@Service
public class GerenciadorEventos {
	@Autowired
	private InterfaceCadastroEvento cadastroEvento;
	
	//Eventos
	public List<Evento> procurarClienteNome(String nome) {
		return cadastroEvento.procurarClienteNome(nome);
	}
	
	public Evento procurarClienteId(long id) {
		return cadastroEvento.procurarClienteId(id);
	}

	public List<Evento> listarClientes() {
		return cadastroEvento.listarClientes();
	}
	
	public void deletarClienteId(Long id) {
		cadastroEvento.deletarClienteId(id);
	}

	public Evento salvarCliente(Evento evento) {
		return cadastroEvento.salvarCliente(evento);
	}
	
	public void deletarCliente(Evento cliente) {
		cadastroEvento.deletarCliente(cliente);
	}
}
