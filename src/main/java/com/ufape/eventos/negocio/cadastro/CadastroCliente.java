package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.dados.ColecaoCliente;
import com.ufape.eventos.negocio.basica.Cliente;

public class CadastroCliente implements InterfaceCadastroCliente {
	
	private ColecaoCliente colecaocliente;
	
	@Override
	public List<Cliente> procurarCliente(String nome) {
		
		return colecaocliente.FindByNomeContaining(nome);
	}

	@Override
	public Cliente procurarClienteId(long id) {
		return colecaocliente.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> listarClientes() {
		return colecaocliente.findAll();
	}

	@Override
	public Cliente salvarcliente(Cliente cliente) {
		return colecaocliente.save(cliente);
	}

	@Override
	public void deletarCliente(long id) {
		colecaocliente.deleteById(id);
	}

}
