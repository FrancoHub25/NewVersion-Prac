package com.practicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.practicas.entities.Docente;

public interface DocenteRepository {
  
	
	@Query("select d from Docente d where d.nombre like ?1")
	public List<Docente> listaNombreLike(String nombre);
	
}
