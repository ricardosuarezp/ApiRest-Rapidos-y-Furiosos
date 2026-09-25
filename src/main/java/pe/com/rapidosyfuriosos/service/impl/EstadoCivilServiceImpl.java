package pe.com.rapidosyfuriosos.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.rapidosyfuriosos.entity.EstadoCivilEntity;
import pe.com.rapidosyfuriosos.repository.EstadoCivilRepository;
import pe.com.rapidosyfuriosos.service.EstadoCivillService;

@Service
public class EstadoCivilServiceImpl implements EstadoCivillService {
	
	@Autowired
	private EstadoCivilRepository repositorio;
	
	@Override
	public List<EstadoCivilEntity> findAll() {
		return repositorio.findAll();
	}
	
	@Override
	public List<EstadoCivilEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	
	@Override
	public EstadoCivilEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	
	@Override
	public EstadoCivilEntity add(EstadoCivilEntity obj) {
		return repositorio.save(obj);
	}
	
	@Override
	public EstadoCivilEntity update(EstadoCivilEntity obj, Long id) {
		EstadoCivilEntity objestc = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objestc);
		return repositorio.save(objestc);
	}
	
	@Override
	public EstadoCivilEntity delete(Long id) {
		EstadoCivilEntity objestc = repositorio.findById(id).get();
		objestc.setEstado(false);
		return repositorio.save(objestc);
	}
	
	@Override
	public EstadoCivilEntity enable(Long id) {
		EstadoCivilEntity objestc = repositorio.findById(id).get();
		objestc.setEstado(true);
		return repositorio.save(objestc);
	}
}