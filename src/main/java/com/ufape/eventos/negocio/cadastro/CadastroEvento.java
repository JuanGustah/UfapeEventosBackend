package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoEvento;
import com.ufape.eventos.negocio.basica.Evento;

@Service
public class CadastroEvento implements InterfaceCadastroEvento{
	@Autowired
	private ColecaoEvento colecaoEvento;
	
	@Override
	public List<Evento> procurarClienteNome(String nome) {
		return colecaoEvento.findByNomeContaining(nome);
	}
	
	@Override
	public Evento procurarClienteId(long id) {
		return colecaoEvento.findById(id).orElse(null);
	}

	@Override
	public List<Evento> listarClientes() {
		return colecaoEvento.findAll();
	}

	@Override
	public void deletarClienteId(Long id) {
		colecaoEvento.deleteById(id);
	}

	@Override
	public Evento salvarCliente(Evento evento) {
		return colecaoEvento.save(evento);
	}
	
	@Override
	public void deletarCliente(Evento cliente) {
		colecaoEvento.delete(cliente);
	}
}
