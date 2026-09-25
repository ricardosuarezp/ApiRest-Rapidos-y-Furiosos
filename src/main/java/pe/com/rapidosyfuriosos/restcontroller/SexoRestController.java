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

import pe.com.rapidosyfuriosos.entity.SexoEntity;
import pe.com.rapidosyfuriosos.service.SexoService;

@RestController
@RequestMapping("/api/sexo")
public class SexoRestController {

	@Autowired
	private SexoService sexoService;
	
	@GetMapping
	public List<SexoEntity> findAll(){
		return sexoService.findAll();
	}
	
	@GetMapping("/custom")
	public List<SexoEntity> findAllCustom(){
		return sexoService.findAllCustom();
	}
	
	@GetMapping("{id}")
	public SexoEntity findById(@PathVariable Long id) {
		return sexoService.findById(id);
	}
	
	@PostMapping
	public SexoEntity add(@RequestBody SexoEntity obj) {
		return sexoService.add(obj);
	}
	
	@PutMapping("/{id}")
	public SexoEntity update(@RequestBody SexoEntity objsex,@PathVariable Long id) {
		return sexoService.update(objsex, id);
	}
	
	@DeleteMapping("/{id}")
	public SexoEntity delete(@PathVariable Long id) {
		return sexoService.delete(id);
	}
	@PatchMapping("/{id}")
	public SexoEntity enable(@PathVariable Long id) {
		return sexoService.enable(id);
	}
}
