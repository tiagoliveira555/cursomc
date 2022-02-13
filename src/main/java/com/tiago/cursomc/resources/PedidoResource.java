package com.tiago.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.cursomc.domain.Pedido;
import com.tiago.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
}
