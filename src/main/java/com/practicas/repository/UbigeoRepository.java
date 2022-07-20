package com.practicas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practicas.entities.Ubigeo;

public interface UbigeoRepository {
  
	@Query("select distinct x.departamento from Ubigeo x order by 1 asc")
	public abstract List<String> listasDepartamentos();
	
	@Query("select distinct x.provincia from Ubigeo x where x.departamento = :var_dep  order by 1 asc")
	public abstract List<String> listasProvincias(@Param("var_dep") String departamento);
	
	@Query("select x from Ubigeo x where x.departamento = :var_dep and x.provincia = :var_pro  order by x.distrito asc")
	public abstract List<Ubigeo> listasDistritos(@Param("var_dep") String departamento, @Param("var_pro") String provincia);
	
}
