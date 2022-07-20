package com.practicas.service;

import java.util.List;
import java.util.Optional;

import com.practicas.entities.Docente;

public interface DocenteService {
  
	public abstract Docente insertarActualizarDocente(Docente docente);
	public abstract List<Docente> listDocentesNomLike(String nombre);
	public abstract void eliminarDocentes(int id);
	public abstract Optional<Docente> buscaDocente(int id);
	
}
