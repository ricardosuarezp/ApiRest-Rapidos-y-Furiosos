package pe.com.rapidosyfuriosos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.rapidosyfuriosos.entity.TipoDocumentoEntity;
import pe.com.rapidosyfuriosos.service.TipoDocumentoService;

@RestController
@RequestMapping("/api/tipodocumento")
public class TipoDocumentoRestController {
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping
	public List<TipoDocumentoEntity> findAll(){
		return tipoDocumentoService.findAll();
	}
	
	@GetMapping("/custom")
	public List<TipoDocumentoEntity> findAllCustom(){
		return tipoDocumentoService.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public TipoDocumentoEntity findById(@PathVariable Long id) {
		return tipoDocumentoService.findById(id);
	}
	
	@PostMapping
	public TipoDocumentoEntity add(@RequestBody TipoDocumentoEntity obj) {
		return tipoDocumentoService.add(obj);
	}
	
	@PutMapping("/{id}")
	public TipoDocumentoEntity update(@RequestBody TipoDocumentoEntity objsex,@PathVariable Long id) {
		return tipoDocumentoService.update(objsex, id);
	}
	
	@DeleteMapping("/{id}")
	public TipoDocumentoEntity delete(@PathVariable Long id) {
		return tipoDocumentoService.delete(id);
	}
	@PatchMapping("/{id}")
	public TipoDocumentoEntity enable(@PathVariable Long id) {
		return tipoDocumentoService.enable(id);
	}

}
