package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufape.eventos.negocio.basica.AgenciaImprensa;

@Repository
public interface ColecaoAgenciaImprensa extends JpaRepository<AgenciaImprensa, Long> {
	public List<AgenciaImprensa> findByNomeContaining(String nome);
	public List<AgenciaImprensa> findByCnpjContaining(String cnpj);
}
