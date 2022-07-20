package com.practicas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicas.entities.Docente;
import com.practicas.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repo;
	
	@Override
	public Docente insertarActualizarDocente(Docente docente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docente> listDocentesNomLike(String nombre) {
		// TODO Auto-generated method stub
		return repo.listaNombreLike(nombre);
	}

	@Override
	public void eliminarDocentes(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Docente> buscaDocente(int id) {
		// TODO Auto-generated method stub
		return null;
	}
  
	
	
	
}
