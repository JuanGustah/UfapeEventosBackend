package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoAtividade;
import com.ufape.eventos.negocio.basica.Atividade;
import com.ufape.eventos.negocio.basica.AtividadeNaoEncontradaException;

@Service
public class CadastroAtividade implements InterfaceCadastroAtividade {
	@Autowired
	private ColecaoAtividade colecaoAtividade;
	
	@Override
	public List<Atividade> procurarAtividadeAssunto(String nome) {
		return colecaoAtividade.findByAssunto(nome);
	}
	
	@Override
	public List<Atividade> procurarAtividadeAtracao(String nome) {
		return colecaoAtividade.findByAtracao(nome);
	}
	
	@Override
	public Atividade procurarAtividadeId(long id) throws AtividadeNaoEncontradaException{
		Atividade atividade = colecaoAtividade.findById(id).orElse(null);
		
		if(atividade == null) {
			throw new AtividadeNaoEncontradaException();
		}
		
		return atividade;
	}

	@Override
	public List<Atividade> listarAtividades() {
		return colecaoAtividade.findAll();
	}

	@Override
	public void deletarAtividadeId(Long id) {
		colecaoAtividade.deleteById(id);
	}

	@Override
	public Atividade salvarAtividade(Atividade atividade) {
		return colecaoAtividade.save(atividade);
	}
}
