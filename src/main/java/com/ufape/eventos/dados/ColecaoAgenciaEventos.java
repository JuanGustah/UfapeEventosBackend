package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.AgenciaEventos;

public interface ColecaoAgenciaEventos extends JpaRepository<AgenciaEventos, Long> {
	public List<AgenciaEventos> FindByNomeContaining(String nome);
	public List<AgenciaEventos> FindByCnpjContaining(String cnpj);
}
