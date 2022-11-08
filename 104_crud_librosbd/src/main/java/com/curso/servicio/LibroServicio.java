package com.curso.servicio;

import java.util.List;

import com.curso.modelo.Libro;

public interface LibroServicio {
	
	List<Libro> libros();
	Libro buscarLibro(int id);
	void altaLibro(Libro libro);
	void actualizarLibro(Libro libro);
	void eliminarLibro(int id);

}
