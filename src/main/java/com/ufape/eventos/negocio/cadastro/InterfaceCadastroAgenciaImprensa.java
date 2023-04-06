package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.AgenciaImprensa;
import com.ufape.eventos.negocio.basica.AgenciaImprensaNaoEncontradaException;

public interface InterfaceCadastroAgenciaImprensa {

	List<AgenciaImprensa> procurarAgenciaImprensaNome(String nome);
	
	List<AgenciaImprensa> procurarAgenciaImprensaCnpj(String cnpj);
	
	AgenciaImprensa procurarAgenciaImprensaId(long id) throws AgenciaImprensaNaoEncontradaException;
	
	List<AgenciaImprensa> listarAgenciasImprensa();
	
	void deletarAgenciaImprensaId(Long id);
	
	AgenciaImprensa atualizarAgenciaImprensa(AgenciaImprensa agenciaImprensa);
	
	AgenciaImprensa salvarAgenciaImprensa(AgenciaImprensa agenciaImprensa);
	
	void deletarAgenciaImprensa(AgenciaImprensa agenciaImprensa) throws AgenciaImprensaNaoEncontradaException;

}
