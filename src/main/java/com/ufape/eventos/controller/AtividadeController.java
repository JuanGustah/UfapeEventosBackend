package com.ufape.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.eventos.negocio.basica.Atividade;
import com.ufape.eventos.negocio.basica.AtividadeNaoEncontradaException;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;
import com.ufape.eventos.negocio.fachada.GerenciadorEventos;

@CrossOrigin (origins = "http://localhost:3333/" )
@RestController
public class AtividadeController {
	@Autowired
	private GerenciadorEventos gerenciadorEventos;
	
	@PostMapping(value = "/atividade/{idEvento}")
	public ResponseEntity<Atividade> adicionarAtividade(@RequestBody Atividade atividade, @PathVariable long idEvento) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.salvarAtividade(atividade,idEvento));
		} catch (EventoNaoEncontradoException e) {
			return new ResponseEntity<Atividade> (HttpStatus.BAD_REQUEST);
		}
		catch (DataJaPassouException e) {
			return new ResponseEntity<Atividade> (HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/atividade/{idAtividade}")
	public ResponseEntity<Atividade> carregarEvento(@PathVariable long idAtividade) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.procurarAtividadeId(idAtividade));
		} catch (AtividadeNaoEncontradaException e) {
			return new ResponseEntity<Atividade> (HttpStatus.BAD_REQUEST);
		}
	}
}

