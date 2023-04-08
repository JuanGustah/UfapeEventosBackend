package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufape.eventos.negocio.basica.Atividade;

@Repository
public interface ColecaoAtividade extends JpaRepository<Atividade, Long>{
	public List<Atividade> findByAssunto(String assunto);
	public List<Atividade> findByAtracao(String assunto);
}
