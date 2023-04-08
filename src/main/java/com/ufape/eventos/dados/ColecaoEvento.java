package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufape.eventos.negocio.basica.Evento;
@Repository
public interface ColecaoEvento extends JpaRepository<Evento, Long>{
	public List<Evento> findByNomeContaining(String nome);
}
