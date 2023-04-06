package com.ufape.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ufape.eventos.controller.dto.AtualizarEventoRequest;
import com.ufape.eventos.negocio.basica.DataJaPassouException;
import com.ufape.eventos.negocio.basica.Evento;
import com.ufape.eventos.negocio.basica.EventoNaoEncontradoException;
import com.ufape.eventos.negocio.fachada.GerenciadorEventos;


@CrossOrigin (origins = "http://localhost:3333/" )
@RestController
public class EventoController {
	@Autowired
	private GerenciadorEventos gerenciadorEventos;
	
	@PostMapping(value = "/evento")
	public ResponseEntity<Evento> adicionarEvento(@RequestBody Evento evento) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.salvarEvento(evento));
		} catch (DataJaPassouException e) {
			return new ResponseEntity<Evento> (HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value = "/evento/{eventoId}")
	public ResponseEntity<Evento> carregarEvento(@PathVariable long eventoId) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.procurarEventoId(eventoId));
		} catch (EventoNaoEncontradoException e) {
			return new ResponseEntity<Evento> (HttpStatus.BAD_REQUEST);
		}
	}
	
	@PatchMapping(value = "/evento/${eventoId}")
	public ResponseEntity<Evento> atualizarEvento(@PathVariable long eventoId, @RequestBody AtualizarEventoRequest evento) {
		try {
			return ResponseEntity.ok(gerenciadorEventos.atualizarEvento(evento,eventoId));
		} catch (Exception e) {
			return new ResponseEntity<Evento>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(value = "/evento/{eventoId}")
	public ResponseEntity<String> deletarEvento(@PathVariable long eventoId) {
		try {
			gerenciadorEventos.deletarEventoId(eventoId);
			return new ResponseEntity<String> ("Evento cancelado com sucesso.",HttpStatus.OK);
		} catch (EventoNaoEncontradoException e) {
			return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);
		}
	}
}
