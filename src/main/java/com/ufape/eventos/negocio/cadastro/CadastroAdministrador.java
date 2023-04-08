package com.ufape.eventos.negocio.cadastro;

import java.util.List;

import com.ufape.eventos.dados.ColecaoAdministrador;
import com.ufape.eventos.negocio.basica.Administrador;

public class CadastroAdministrador implements InterfaceCadastroAdministrador {
	private ColecaoAdministrador colecaoAdm;
	
	@Override
	public List<Administrador> procurarAdm(String nome) {
		return colecaoAdm.FindByNomeContaining(nome);
	}

	@Override
	public Administrador procurarAdmId(long id){
		return colecaoAdm.findById(id).orElse(null);
	}

	@Override
	public List<Administrador> listarAdm() {
		return colecaoAdm.findAll();
	}

	@Override
	public Administrador salvarAdm(Administrador adm) {
		return colecaoAdm.save(adm);
	}

	@Override
	public void deletarAdm(long id) {
		colecaoAdm.deleteById(id);
	}

}
