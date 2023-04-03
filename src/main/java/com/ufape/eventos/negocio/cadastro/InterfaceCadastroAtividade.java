package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Atividade;

public interface InterfaceCadastroAtividade {

	List<Atividade> procurarAtividadeAssunto(String nome);
	
	List<Atividade> procurarAtividadeAtracao(String nome);

	Atividade procurarAtividadeId(long id);

	List<Atividade> listarAtividades();

	void deletarAtividadeId(Long id);

	Atividade salvarAtividade(Atividade entity);
}