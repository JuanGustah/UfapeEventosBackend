package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufape.eventos.negocio.basica.Usuario;


public interface ColecaoUsuario extends JpaRepository<Usuario, Long> {
	public List<Usuario> findByNomeContaining(String nome);
}
