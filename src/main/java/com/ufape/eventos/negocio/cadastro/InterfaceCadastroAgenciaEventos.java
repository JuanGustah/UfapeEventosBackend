package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.AgenciaEventos;
import com.ufape.eventos.negocio.basica.AgenciaEventosNaoEncontradaException;

public interface InterfaceCadastroAgenciaEventos {

	List<AgenciaEventos> procurarAgenciaEventosNome(String nome);
	
	List<AgenciaEventos> procurarAgenciaEventosCnpj(String cnpj);
	
	AgenciaEventos procurarAgenciaEventosId(long id) throws AgenciaEventosNaoEncontradaException;
	
	List<AgenciaEventos> listarAgenciasEventos();
	
	void deletarAgenciaEventosId(Long id);
	
	AgenciaEventos atualizarAgenciaEventos(AgenciaEventos agenciaEventos);
	
	AgenciaEventos salvarAgenciaEventos(AgenciaEventos agenciaEventos);
	
	void deletarAgenciaEventos(AgenciaEventos agenciaEventos) throws AgenciaEventosNaoEncontradaException;

}
