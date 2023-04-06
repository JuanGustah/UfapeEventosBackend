package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufape.eventos.dados.ColecaoUsuario;
import com.ufape.eventos.negocio.basica.Usuario;

@Service
public class CadastroUsuario implements InterfaceCadastroUsuario {

	@Autowired
	private ColecaoUsuario colecaoUsuario;
	

	@Override
	public Usuario procurarUsuarioId(long id) {
		
		return colecaoUsuario.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> procurarUsuarioNome(String nome) {

		return colecaoUsuario.findByNomeContaining(nome);
	}

	@Override
	public List<Usuario> ListarUsuario() {
	
		return colecaoUsuario.findAll();
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		
		return colecaoUsuario.save(usuario);
	}

	@Override
	public void deletarUsuarioId(Long id) {
		colecaoUsuario.deleteById(id);
	}

	@Override
	public void deletarUsuario(Usuario usuario) {
		colecaoUsuario.delete(usuario);
	}

}
