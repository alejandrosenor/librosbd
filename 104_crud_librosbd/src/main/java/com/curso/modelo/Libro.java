package com.curso.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Lo identifico como entidad JPA
@Table(name = "libros") // Enlazamos con la tabla libros de nuestra bbdd
public class Libro {
	
	@Id
	private int id; // Establecemos que este atributo es la clave primaria
	
	private int isbn;
	private String titulo;
	private String tematica;
	
	public Libro(int id, int isbn, String titulo, String tematica) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}

	public Libro() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

}
