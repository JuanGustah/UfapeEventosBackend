package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.Ingresso;

public interface ColecaoIngressos extends JpaRepository<Ingresso, Long> {

	public List<Ingresso> findByTipoContaining(String tipo);

}