package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.Evento;

public interface ColecaoEvento extends JpaRepository<Evento, Long>{
	public List<Evento> findByNomeContaining(String nome);
}
