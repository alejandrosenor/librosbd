package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.modelo.Libro;

public interface LibrosDao extends JpaRepository<Libro, Integer> {
	
	

}
