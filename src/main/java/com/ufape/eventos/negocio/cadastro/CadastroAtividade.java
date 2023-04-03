package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.dados.ColecaoAtividade;
import com.ufape.eventos.negocio.basica.Atividade;

public class CadastroAtividade implements InterfaceCadastroAtividade {
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
	public Atividade procurarAtividadeId(long id) {
		return colecaoAtividade.findById(id).orElse(null);
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
