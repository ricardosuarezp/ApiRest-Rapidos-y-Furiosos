package pe.com.rapidosyfuriosos.service;

import java.util.List;

import pe.com.rapidosyfuriosos.entity.TipoDocumentoEntity;

public interface TipoDocumentoService {

	List<TipoDocumentoEntity> findAll();
	List<TipoDocumentoEntity> findAllCustom();
	TipoDocumentoEntity findById(Long id);
	TipoDocumentoEntity add(TipoDocumentoEntity objtde);
	TipoDocumentoEntity update(TipoDocumentoEntity objtde,Long id);
	TipoDocumentoEntity delete(Long id);
	TipoDocumentoEntity enable(Long id);
}
