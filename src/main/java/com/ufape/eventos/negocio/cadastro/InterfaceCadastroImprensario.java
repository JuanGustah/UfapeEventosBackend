package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Imprensario;

public interface InterfaceCadastroImprensario  {
	
	List<Imprensario> procurarImprensario(String nome);
	
	Imprensario procurarImprensarioId(long id);
	
	List<Imprensario> listarImprensario();
	
	Imprensario salvarImprensario(Imprensario imprensario);
	
	void deletarImprensario(long id);
}
