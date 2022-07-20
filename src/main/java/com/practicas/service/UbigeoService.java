package com.practicas.service;

import java.util.List;

import com.practicas.entities.Ubigeo;

public interface UbigeoService {
  
    public abstract List<String> listDepartamentos();
	
	public abstract List<String> listProvincias(String departamentos);
	
	public abstract List<Ubigeo> listDistritos(String departamentos, String provincias);
	
	
}
