package com.micaellopes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micaellopes.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		var cat1 = new Categoria(1, "Informática");
		var cat2 = new Categoria(2, "Escritório");
		
		var lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
