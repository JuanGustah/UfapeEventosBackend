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

import com.ufape.eventos.negocio.basica.AgenciaEventos;
import com.ufape.eventos.negocio.basica.AgenciaEventosNaoEncontradaException;
import com.ufape.eventos.negocio.fachada.GerenciadorEventos;

@CrossOrigin (origins = "http://localhost:3333/" )
@RestController
public class AgenciaEventosController {
	@Autowired
	private GerenciadorEventos gerenciadorEventos;
	
	@PostMapping(value = "/agenciaEventos")
	public ResponseEntity<AgenciaEventos> adicionarAgenciaEventos(@RequestBody AgenciaEventos agenciaEventos) {
			return ResponseEntity.ok(gerenciadorEventos.salvarAgenciaEventos(agenciaEventos));
	}
	
	
	
	@GetMapping(value = "/agenciaEventos/{agenciaEventosId}")
	public ResponseEntity<AgenciaEventos> carregarAgenciaEventos(@PathVariable long agenciaEventosId) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.procurarAgenciaEventosId(agenciaEventosId));
		} catch (AgenciaEventosNaoEncontradaException e) {
			return new ResponseEntity<AgenciaEventos> (HttpStatus.BAD_REQUEST);
		}
	}
}
