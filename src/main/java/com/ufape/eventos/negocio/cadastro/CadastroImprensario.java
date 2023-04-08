package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.dados.ColecaoImprensario;
import com.ufape.eventos.negocio.basica.Imprensario;

public class CadastroImprensario implements InterfaceCadastroImprensario{
	
	private ColecaoImprensario colecaoimprensario;
	
	@Override
	public List<Imprensario> procurarImprensario(String nome) {
		return colecaoimprensario.FindByNomeContaining(nome);
	}

	@Override
	public Imprensario procurarImprensarioId(long id) {
		return colecaoimprensario.findById(id).orElse(null);
	}

	@Override
	public List<Imprensario> listarImprensario() {
		return colecaoimprensario.findAll();
	}

	@Override
	public Imprensario salvarImprensario(Imprensario imprensario) {
		return colecaoimprensario.save(imprensario);
	}

	@Override
	public void deletarImprensario(long id) {
		colecaoimprensario.deleteById(id);
	}

}
