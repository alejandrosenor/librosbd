package com.curso.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibrosDao;
import com.curso.modelo.Libro;

@Service
public class LibrosServicioImpl implements LibroServicio {
	
	@Autowired
	LibrosDao dao;

	@Override
	public List<Libro> libros() {
		
		return dao.findAll();
		
	}

	@Override
	public Libro buscarLibro(int id) {
		
		return dao.findById(id).orElse(null);
		
	}

	@Override
	public void altaLibro(Libro libro) {
		
		dao.save(libro);

	}

	@Override
	public void actualizarLibro(Libro libro) {
		
		dao.save(libro);

	}

	@Override
	public void eliminarLibro(int id) {
		
		dao.deleteById(id);
		
	}

}
