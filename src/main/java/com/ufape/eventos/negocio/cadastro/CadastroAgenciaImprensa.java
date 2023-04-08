package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoAgenciaImprensa;
import com.ufape.eventos.negocio.basica.AgenciaImprensa;
import com.ufape.eventos.negocio.basica.AgenciaImprensaNaoEncontradaException;

@Service
public class CadastroAgenciaImprensa implements InterfaceCadastroAgenciaImprensa {
	@Autowired
	private ColecaoAgenciaImprensa colecaoAgenciaImprensa;
	
	@Override
	public List<AgenciaImprensa> procurarAgenciaImprensaNome(String nome){
		return colecaoAgenciaImprensa.findByNomeContaining(nome);
	}
	
	@Override
	public List<AgenciaImprensa> procurarAgenciaImprensaCnpj(String cnpj) {
		return colecaoAgenciaImprensa.findByCnpjContaining(cnpj);
	}
	
	@Override
	public AgenciaImprensa procurarAgenciaImprensaId(long id) throws AgenciaImprensaNaoEncontradaException {
		AgenciaImprensa agenciaImprensa = colecaoAgenciaImprensa.findById(id).orElse(null);
		
		if(agenciaImprensa == null) {
			throw new AgenciaImprensaNaoEncontradaException();
		}
		
		return agenciaImprensa;
	}
	
	@Override
	public List<AgenciaImprensa> listarAgenciasImprensa() {
		return colecaoAgenciaImprensa.findAll();
	}
	
	@Override
	public void deletarAgenciaImprensaId(Long id) {
		colecaoAgenciaImprensa.deleteById(id);
	}
	
	@Override
	public AgenciaImprensa atualizarAgenciaImprensa(AgenciaImprensa agenciaImprensa) {
		return colecaoAgenciaImprensa.save(agenciaImprensa);
	}
	
	@Override
	public AgenciaImprensa salvarAgenciaImprensa(AgenciaImprensa agenciaImprensa) {
		return colecaoAgenciaImprensa.save(agenciaImprensa);
	}
	
	@Override
	public void deletarAgenciaImprensa(AgenciaImprensa agenciaImprensa) throws AgenciaImprensaNaoEncontradaException {
	    if (!colecaoAgenciaImprensa.existsById(agenciaImprensa.getId())) {
	        throw new AgenciaImprensaNaoEncontradaException();
	    }
	    colecaoAgenciaImprensa.delete(agenciaImprensa);
	}

}
