package com.ufape.eventos.negocio.cadastro;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoEvento;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;
import com.ufape.eventos.negocio.basica.Evento;

@Service
public class CadastroEvento implements InterfaceCadastroEvento{
	@Autowired
	private ColecaoEvento colecaoEvento;
	
	@Override
	public List<Evento> procurarEventoNome(String nome) {
		return colecaoEvento.findByNomeContaining(nome);
	}
	
	@Override
	public Evento procurarEventoId(long id) throws EventoNaoEncontradoException {
		Evento evento = colecaoEvento.findById(id).orElse(null);
		
		if(evento == null) {
			throw new EventoNaoEncontradoException();
		}
		
		return evento;
	}

	@Override
	public List<Evento> listarEventos() {
		return colecaoEvento.findAll();
	}

	@Override
	public void deletarEventoId(Long id) {
		colecaoEvento.deleteById(id);
	}

	@Override
	public Evento salvarEvento(Evento evento) throws DataJaPassouException{
		if(evento.getData().before(new Date())) {
			throw new DataJaPassouException();
		}
		return colecaoEvento.save(evento);
	}
	
	@Override
	public Evento atualizarEvento(Evento evento) {
		return colecaoEvento.save(evento);
	}
}
