package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.Administrador;

public interface ColecaoAdministrador extends JpaRepository<Administrador, Long> {
	public List<Administrador> FindByNomeContaining(String nome);
	public List<Administrador> FindById(long id);
}
