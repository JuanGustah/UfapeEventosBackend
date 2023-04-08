package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.negocio.basica.Administrador;

public interface InterfaceCadastroAdministrador {
	
	List <Administrador> procurarAdm(String nome);
	
	Administrador procurarAdmId(long id);
	
	List<Administrador> listarAdm();
	
	Administrador salvarAdm(Administrador adm);
	
	void deletarAdm(long id);
	
}
