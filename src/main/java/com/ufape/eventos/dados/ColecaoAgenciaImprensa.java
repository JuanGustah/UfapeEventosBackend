package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.AgenciaImprensa;

public interface ColecaoAgenciaImprensa extends JpaRepository<AgenciaImprensa, Long> {
	public List<AgenciaImprensa> FindByNomeContaining(String nome);
	public List<AgenciaImprensa> FindByCnpjContaining(String cnpj);
}
