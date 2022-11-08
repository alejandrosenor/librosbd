package com.curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.modelo.Libro;
import com.curso.servicio.LibroServicio;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class LibrosController {
	
	@Autowired
	LibroServicio servicio;
	
	@ApiOperation(value = "Busca un libro por su id")
	@GetMapping(value = "libro/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@ApiParam(value = "id del libro a buscar") @PathVariable ("id") int id) {
		
		return servicio.buscarLibro(id);
		
	}
	
	@ApiOperation(value = "Devuelve la lista con todos los libros")
	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> libros() {
		
		return servicio.libros();
		
	}
	
	@PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	void altaLibro(@RequestBody Libro libro) {
		
		servicio.altaLibro(libro);
		
	}
	
	@PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
	void actualizarLibro(@RequestBody Libro libro) {
		
		servicio.actualizarLibro(libro);
		
	}
	
	@DeleteMapping(value = "libro/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	void eliminarLibro(@PathVariable ("id") int id) {
		
		servicio.eliminarLibro(id);
		
	}

}
