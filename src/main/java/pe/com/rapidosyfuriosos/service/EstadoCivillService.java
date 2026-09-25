package pe.com.rapidosyfuriosos.service;

import java.util.List;

import pe.com.rapidosyfuriosos.entity.EstadoCivilEntity;

public interface EstadoCivillService {

	List<EstadoCivilEntity> findAll();
	List<EstadoCivilEntity> findAllCustom();
	EstadoCivilEntity findById(Long id);
	EstadoCivilEntity add(EstadoCivilEntity objeci);
	EstadoCivilEntity update(EstadoCivilEntity objeci, Long id);
	EstadoCivilEntity delete(Long id);
	EstadoCivilEntity enable(Long id);
}
