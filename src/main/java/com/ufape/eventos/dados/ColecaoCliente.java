package com.ufape.eventos.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ufape.eventos.negocio.basica.Cliente;

public interface ColecaoCliente extends JpaRepository<Cliente, Long> {
	public List<Cliente> FindByNomeContaining(String nome);
	public List<Cliente> FindById(long id);
}
