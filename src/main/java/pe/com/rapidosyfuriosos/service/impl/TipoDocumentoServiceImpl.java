package pe.com.rapidosyfuriosos.service.impl;

import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.rapidosyfuriosos.entity.TipoDocumentoEntity;
import pe.com.rapidosyfuriosos.repository.TipoDocumentoRepository;
import pe.com.rapidosyfuriosos.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService{

	private TipoDocumentoRepository tipoDocumentoRepository;
	
	public TipoDocumentoServiceImpl(TipoDocumentoRepository tipoDocumentoRepository) {
		this.tipoDocumentoRepository = tipoDocumentoRepository;
		
	}

	@Override
	public List<TipoDocumentoEntity> findAll() {
		return tipoDocumentoRepository.findAll();
	}

	@Override
	public List<TipoDocumentoEntity> findAllCustom() {
		return tipoDocumentoRepository.findAllCustom();
	}

	@Override
	public TipoDocumentoEntity findById(Long id) {
		return tipoDocumentoRepository.findById(id).get();
	}

	@Override
	public TipoDocumentoEntity add(TipoDocumentoEntity objtde) {
		return tipoDocumentoRepository.save(objtde);
	}

	@Override
	public TipoDocumentoEntity update(TipoDocumentoEntity objtde, Long id) {
	 TipoDocumentoEntity tdeobj = tipoDocumentoRepository.findById(id).get();
	 BeanUtils.copyProperties(objtde, tdeobj);
	 return tipoDocumentoRepository.save(tdeobj);
	}

	@Override
	public TipoDocumentoEntity delete(Long id) {
		TipoDocumentoEntity tdeobj = tipoDocumentoRepository.findById(id).get();
		tdeobj.setEstado(false);
		return tipoDocumentoRepository.save(tdeobj);
	}

	@Override
	public TipoDocumentoEntity enable(Long id) {
		TipoDocumentoEntity tdeobj = tipoDocumentoRepository.findById(id).get();
		tdeobj.setEstado(true);
		return tipoDocumentoRepository.save(tdeobj);
	}
	
	
}
