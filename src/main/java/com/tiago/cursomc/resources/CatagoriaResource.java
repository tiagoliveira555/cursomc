package com.tiago.cursomc.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CatagoriaResource {

	@GetMapping
	public List<Categoria> findAll() {
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = Arrays.asList(cat1, cat2);
		
		return lista;
		
	}
	
}
