package com.ufape.eventos.negocio.cadastro;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoIngressos;
import com.ufape.eventos.negocio.basica.DataIngressoJaPassouException;
import com.ufape.eventos.negocio.basica.Ingresso;
import com.ufape.eventos.negocio.basica.IngressoNaoEncontradoException;

@Service
public class CadastroIngressos implements InterfaceCadastroIngressos {
	@Autowired
	private ColecaoIngressos colecaoIngressos;
	
	@Override
	public List<Ingresso> procurarIngressoTipo(String tipo) {
		return colecaoIngressos.findByTipoContaining(tipo);
	}
	
	@Override
	public Ingresso procurarIngressoId(long id) throws IngressoNaoEncontradoException {
		Ingresso ingresso = colecaoIngressos.findById(id).orElse(null);
		
		if(ingresso == null) {
			throw new IngressoNaoEncontradoException();
		}
		
		return ingresso;
	}

	@Override
	public List<Ingresso> listarIngressos() {
		return colecaoIngressos.findAll();
	}

	@Override
	public void deletarIngressoId(Long id) {
		colecaoIngressos.deleteById(id);
	}

	@Override
	public Ingresso salvarIngresso(Ingresso ingresso) throws DataIngressoJaPassouException{
		if(ingresso.getDataEmissao().before(new Date())) {
			throw new DataIngressoJaPassouException();
		}
		return colecaoIngressos.save(ingresso);
	}
	
	@Override
	public Ingresso atualizarIngresso(Ingresso ingresso) {
		return colecaoIngressos.save(ingresso);
	}
}