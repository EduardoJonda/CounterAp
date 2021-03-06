package org.springframework.samples.petclinic.repository;

import org.springframework.data.domain.Pageable;
import java.util.Collection;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.samples.petclinic.model.Reporte;

public interface ReporteRepository {

	Collection<Reporte> findAll() throws DataAccessException;
	
	Collection<Reporte> findByEstado(String estado ) throws DataAccessException;
		
	Reporte findById(int id) throws DataAccessException;
	
	void save(Reporte reporte) throws DataAccessException;
	
	void delete(Reporte reporte) throws DataAccessException;
	
	Collection<Reporte> findByRegion(String ubicacion)throws DataAccessException;
	
	Collection<Reporte> findByTipoDelito(String tipo_delito ) throws DataAccessException;
	
	Collection<Reporte> findByFecha(String fecha_creacion)throws DataAccessException;
	// pagina
	Page<Reporte> findAll(Pageable pageRequest)throws DataAccessException; 

}
