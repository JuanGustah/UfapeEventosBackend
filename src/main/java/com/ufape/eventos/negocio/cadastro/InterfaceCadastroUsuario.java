package com.ufape.eventos.negocio.cadastro;

import java.util.List;


import com.ufape.eventos.negocio.basica.Usuario;

public interface InterfaceCadastroUsuario {
	
	Usuario procurarUsuarioId(long id);

	List<Usuario> procurarUsuarioNome(String nome);
	
	List<Usuario>ListarUsuario();
		
	Usuario salvarUsuario(Usuario usuario);
	
	void deletarUsuarioId(Long id);
	
	void deletarUsuario(Usuario usuario);
}
