package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoAgenciaEventos;
import com.ufape.eventos.negocio.basica.AgenciaEventos;
import com.ufape.eventos.negocio.basica.AgenciaEventosNaoEncontradaException;

@Service
public class CadastroAgenciaEventos implements InterfaceCadastroAgenciaEventos {
	@Autowired
	private ColecaoAgenciaEventos colecaoAgenciaEventos;
	
	@Override
	public List<AgenciaEventos> procurarAgenciaEventosNome(String nome){
		return colecaoAgenciaEventos.findByNomeContaining(nome);
	}
	
	@Override
	public List<AgenciaEventos> procurarAgenciaEventosCnpj(String cnpj) {
		return colecaoAgenciaEventos.findByCnpjContaining(cnpj);
	}
	
	@Override
	public AgenciaEventos procurarAgenciaEventosId(long id) throws AgenciaEventosNaoEncontradaException {
		AgenciaEventos agenciaEventos = colecaoAgenciaEventos.findById(id).orElse(null);
		
		if(agenciaEventos == null) {
			throw new AgenciaEventosNaoEncontradaException();
		}
		
		return agenciaEventos;
	}
	
	@Override
	public List<AgenciaEventos> listarAgenciasEventos() {
		return colecaoAgenciaEventos.findAll();
	}
	
	@Override
	public void deletarAgenciaEventosId(Long id) {
		colecaoAgenciaEventos.deleteById(id);
	}
	
	@Override
	public AgenciaEventos atualizarAgenciaEventos(AgenciaEventos agenciaEventos) {
		return colecaoAgenciaEventos.save(agenciaEventos);
	}
	
	@Override
	public AgenciaEventos salvarAgenciaEventos(AgenciaEventos agenciaEventos) {
		return colecaoAgenciaEventos.save(agenciaEventos);
	}
	
	@Override
	public void deletarAgenciaEventos(AgenciaEventos agenciaEventos) throws AgenciaEventosNaoEncontradaException {
	    if (!colecaoAgenciaEventos.existsById(agenciaEventos.getId())) {
	        throw new AgenciaEventosNaoEncontradaException();
	    }
	    colecaoAgenciaEventos.delete(agenciaEventos);
	}

}

