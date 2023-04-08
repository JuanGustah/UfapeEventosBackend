package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.Imprensario;

public interface ColecaoImprensario extends JpaRepository<Imprensario, Long> {
	public List <Imprensario> FindByNomeContaining(String nome);
	public List <Imprensario> FindById(long id);
}
