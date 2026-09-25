package pe.com.rapidosyfuriosos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.rapidosyfuriosos.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {

	//utilizamos el JpaReposito por defecto se configura:
	//mostrar,buscar por codigo,registrar, actualizar y eliminar
	
	//agregamos un Query personalizado
	//Consulta MySQL: select * fron distrito where estdis=1
	//creamos un query personalizado
	@Query("select d from DistritoEntity d where d.estado=true")
	List<DistritoEntity> findAllCustom();

}
