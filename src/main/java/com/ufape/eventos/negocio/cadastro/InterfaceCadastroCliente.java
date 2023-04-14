package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Cliente;

public interface InterfaceCadastroCliente {
	
	List<Cliente> procurarCliente(String nome);
	
	Cliente procurarClienteId(long id);
	
	List<Cliente> listarClientes();
	
	Cliente salvarcliente(Cliente cliente);
	
	void deletarCliente(long id);
	
}
