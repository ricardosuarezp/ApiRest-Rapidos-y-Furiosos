package pe.com.rapidosyfuriosos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.rapidosyfuriosos.entity.EstadoCivilEntity;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivilEntity, Long>{

	@Query("select ec from EstadoCivilEntity ec where ec.estado=true")
	List<EstadoCivilEntity> findAllCustom();
			
}
