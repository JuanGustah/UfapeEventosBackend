package com.ufape.eventos.negocio.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.negocio.basica.AgenciaEventos;
import com.ufape.eventos.negocio.basica.AgenciaEventosNaoEncontradaException;
import com.ufape.eventos.negocio.basica.AgenciaImprensa;
import com.ufape.eventos.negocio.basica.AgenciaImprensaNaoEncontradaException;
import com.ufape.eventos.negocio.basica.Atividade;
import com.ufape.eventos.negocio.basica.AtividadeNaoEncontradaException;
import com.ufape.eventos.negocio.basica.DataIngressoJaPassouException;
import com.ufape.eventos.negocio.basica.Evento;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroAgenciaEventos;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroAgenciaImprensa;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroAtividade;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroEvento;
import com.ufape.eventos.negocio.cadastro.InterfaceCadastroIngressos;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;
import com.ufape.eventos.negocio.basica.Ingresso;
import com.ufape.eventos.negocio.basica.IngressoNaoEncontradoException;

@Service
public class GerenciadorEventos {
	@Autowired
	private InterfaceCadastroEvento cadastroEvento;
	@Autowired
	private InterfaceCadastroAtividade cadastroAtividade;
	@Autowired
	private InterfaceCadastroAgenciaImprensa cadastroAgenciaImprensa;
	@Autowired
	private InterfaceCadastroAgenciaEventos  cadastroAgenciaEventos;
	@Autowired
	private InterfaceCadastroIngressos  cadastroIngressos;
	
	//Eventos
	public List<Evento> procurarEventoNome(String nome) {
		return cadastroEvento.procurarEventoNome(nome);
	}
	
	public Evento procurarEventoId(long id) throws EventoNaoEncontradoException{
		return cadastroEvento.procurarEventoId(id);
	}

	public List<Evento> listarEventos() {
		return cadastroEvento.listarEventos();
	}
	
	public void deletarEventoId(Long id) {
		cadastroEvento.deletarEventoId(id);
	}

	public Evento salvarEvento(Evento evento) throws DataJaPassouException{
		return cadastroEvento.salvarEvento(evento);
	}
	
	//Atividades
	public List<Atividade> procurarAtividadeAssunto(String nome) {
		return cadastroAtividade.procurarAtividadeAssunto(nome);
	}
	
	public List<Atividade> procurarAtividadeAtracao(String nome) {
		return cadastroAtividade.procurarAtividadeAtracao(nome);
	}
	
	public Atividade procurarAtividadeId(long id) throws AtividadeNaoEncontradaException{
		return cadastroAtividade.procurarAtividadeId(id);
	}
	
	public void deletarAtividadeId(Long id) {
		cadastroAtividade.deletarAtividadeId(id);
	}
	
	public Atividade salvarAtividade(Atividade atividade,Long idEvento) throws EventoNaoEncontradoException {
		Evento evento = cadastroEvento.procurarEventoId(idEvento);
		Atividade atividadeSalva = cadastroAtividade.salvarAtividade(atividade);
		evento.addAtividade(atividadeSalva);
		cadastroEvento.atualizarEvento(evento);
		return atividadeSalva;
	}
	
	//AgenciasImprensa
	public List<AgenciaImprensa> procurarAgenciaImprensaNome(String nome){
		return cadastroAgenciaImprensa.procurarAgenciaImprensaNome(nome);
	}
	
	public List<AgenciaImprensa> procurarAgenciaImprensaCnpj(String cnpj){
		return cadastroAgenciaImprensa.procurarAgenciaImprensaCnpj(cnpj);
	}
	
	public AgenciaImprensa procurarAgenciaImprensaId(long id) throws AgenciaImprensaNaoEncontradaException{
		return cadastroAgenciaImprensa.procurarAgenciaImprensaId(id);
	}

	public List<AgenciaImprensa> listarAgenciasImprensa(){
		return cadastroAgenciaImprensa.listarAgenciasImprensa();
	}
	
	public void deletarAgenciaImprensaId(Long id) {
		cadastroAgenciaImprensa.deletarAgenciaImprensaId(id);
	}
	
	public AgenciaImprensa atualizarAgenciaImprensa(AgenciaImprensa agenciaImprensa) {
		return cadastroAgenciaImprensa.atualizarAgenciaImprensa(agenciaImprensa);
	}
	
	public AgenciaImprensa salvarAgenciaImprensa(AgenciaImprensa agenciaImprensa) {
		 return cadastroAgenciaImprensa.salvarAgenciaImprensa(agenciaImprensa);
	}
	
	public void deletarAgenciaImprensa(AgenciaImprensa agenciaImprensa) throws AgenciaImprensaNaoEncontradaException{
		cadastroAgenciaImprensa.deletarAgenciaImprensa(agenciaImprensa);
	}
	
	//AgenciasEventos
	public List<AgenciaEventos> procurarAgenciaEventosNome(String nome){
		return cadastroAgenciaEventos.procurarAgenciaEventosNome(nome);
	}
	
	public List<AgenciaEventos> procurarAgenciaEventosCnpj(String cnpj){
		return cadastroAgenciaEventos.procurarAgenciaEventosCnpj(cnpj);
	}
	
	public AgenciaEventos procurarAgenciaEventosId(long id) throws AgenciaEventosNaoEncontradaException{
		return cadastroAgenciaEventos.procurarAgenciaEventosId(id);
	}

	public List<AgenciaEventos> listarAgenciasEventos(){
		return cadastroAgenciaEventos.listarAgenciasEventos();
	}
	
	public void deletarAgenciaEventosId(Long id) {
		cadastroAgenciaEventos.deletarAgenciaEventosId(id);
	}
	
	public AgenciaEventos atualizarAgenciaEventos(AgenciaEventos agenciaEventos) {
		return cadastroAgenciaEventos.atualizarAgenciaEventos(agenciaEventos);
	}
	
	public AgenciaEventos salvarAgenciaEventos(AgenciaEventos agenciaEventos) {
		 return cadastroAgenciaEventos.salvarAgenciaEventos(agenciaEventos);
	}
	
	public void deletarAgenciaEventos(AgenciaEventos agenciaEventos) throws AgenciaEventosNaoEncontradaException{
		cadastroAgenciaEventos.deletarAgenciaEventos(agenciaEventos);
	}
	
	//Ingressos
	public List<Ingresso> procurarIngressoTipo(String tipo){
		 return cadastroIngressos.procurarIngressoTipo(tipo);
	}
	
	public Ingresso procurarIngressoId(long id) throws IngressoNaoEncontradoException{
		return cadastroIngressos.procurarIngressoId(id);
	}
	
	public List<Ingresso> listarIngressos(){
		return cadastroIngressos.listarIngressos();
	}
	
	public void deletarIngressoId(Long id) {
		cadastroIngressos.deletarIngressoId(id);
	}
	
	public Ingresso salvarIngresso(Ingresso ingresso) throws DataIngressoJaPassouException{
		return cadastroIngressos.salvarIngresso(ingresso);
	}
	
	public Ingresso atualizarIngresso(Ingresso ingresso){
		return cadastroIngressos.atualizarIngresso(ingresso);
	}
	
}
