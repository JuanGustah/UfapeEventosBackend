package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufape.eventos.negocio.basica.AgenciaEventos;

@Repository
public interface ColecaoAgenciaEventos extends JpaRepository<AgenciaEventos, Long> {
	public List<AgenciaEventos> findByNomeContaining(String nome);
	public List<AgenciaEventos> findByCnpjContaining(String cnpj);
}
