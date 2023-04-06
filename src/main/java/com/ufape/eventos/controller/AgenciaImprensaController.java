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

import com.ufape.eventos.negocio.basica.AgenciaImprensa;
import com.ufape.eventos.negocio.basica.AgenciaImprensaNaoEncontradaException;
import com.ufape.eventos.negocio.fachada.GerenciadorEventos;

@CrossOrigin (origins = "http://localhost:3333/" )
@RestController
public class AgenciaImprensaController {
	@Autowired
	private GerenciadorEventos gerenciadorEventos;
	
	@PostMapping(value = "/evento")
	public ResponseEntity<AgenciaImprensa> adicionarAgenciaImprensa(@RequestBody AgenciaImprensa agenciaImprensa) {
			return ResponseEntity.ok(gerenciadorEventos.salvarAgenciaImprensa(agenciaImprensa));
	}
	
	
	
	@GetMapping(value = "/agenciaImprensa/{agenciaImprensaId}")
	public ResponseEntity<AgenciaImprensa> carregarAgenciaEventos(@PathVariable long agenciaImprensaId) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.procurarAgenciaImprensaId(agenciaImprensaId));
		} catch (AgenciaImprensaNaoEncontradaException e) {
			return new ResponseEntity<AgenciaImprensa> (HttpStatus.BAD_REQUEST);
		}
	}
}
