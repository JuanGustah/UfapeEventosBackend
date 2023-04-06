package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.DataIngressoJaPassouException;
import com.ufape.eventos.negocio.basica.Ingresso;
import com.ufape.eventos.negocio.basica.IngressoNaoEncontradoException;

public interface InterfaceCadastroIngressos {
	
	List<Ingresso> procurarIngressoTipo(String tipo);
	
	Ingresso procurarIngressoId(long id) throws IngressoNaoEncontradoException;
	
	List<Ingresso> listarIngressos();
	
	void deletarIngressoId(Long id);
	
	Ingresso salvarIngresso(Ingresso ingresso) throws DataIngressoJaPassouException;
	
	Ingresso atualizarIngresso(Ingresso ingresso);

}
