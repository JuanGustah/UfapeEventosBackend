package com.ufape.eventos.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.negocio.basica.Atividade;
import com.ufape.eventos.negocio.basica.Evento;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroAtividade;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroEvento;

@Service
public class GerenciadorEventos {
	@Autowired
	private InterfaceCadastroEvento cadastroEvento;
	@Autowired
	private InterfaceCadastroAtividade cadastroAtividade;
	
	//Eventos
	public List<Evento> procurarEventoNome(String nome) {
		return cadastroEvento.procurarEventoNome(nome);
	}
	
	public Evento procurarEventoId(long id) {
		return cadastroEvento.procurarEventoId(id);
	}

	public List<Evento> listarEventos() {
		return cadastroEvento.listarEventos();
	}
	
	public void deletarEventoId(Long id) {
		cadastroEvento.deletarEventoId(id);
	}

	public Evento salvarEvento(Evento evento) {
		return cadastroEvento.salvarEvento(evento);
	}
	
	//Atividades
	public List<Atividade> procurarAtividadeAssunto(String nome) {
		return cadastroAtividade.procurarAtividadeAssunto(nome);
	}
	
	public List<Atividade> procurarAtividadeAtracao(String nome) {
		return cadastroAtividade.procurarAtividadeAtracao(nome);
	}
	
	public Atividade procurarAtividadeId(long id) {
		return cadastroAtividade.procurarAtividadeId(id);
	}
	
	public void deletarAtividadeId(Long id) {
		cadastroAtividade.deletarAtividadeId(id);
	}
	
	public Atividade salvarAtividade(Atividade atividade,Long idEvento) {
		Evento evento = cadastroEvento.procurarEventoId(idEvento);
		Atividade atividadeSalva = cadastroAtividade.salvarAtividade(atividade);
		evento.addAtividade(atividadeSalva);
		cadastroEvento.salvarEvento(evento);
		return atividadeSalva;
	}
}
