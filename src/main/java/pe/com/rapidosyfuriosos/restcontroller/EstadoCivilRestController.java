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

import pe.com.rapidosyfuriosos.entity.EstadoCivilEntity;
import pe.com.rapidosyfuriosos.service.EstadoCivillService;

@RestController
@RequestMapping("/api/estadocivil")
public class EstadoCivilRestController {
	
	@Autowired
	private EstadoCivillService estadoCivilService;
	
	@GetMapping
	public List<EstadoCivilEntity> findAll(){
		return estadoCivilService.findAll();
	}
	
	@GetMapping("/custom")
	public List<EstadoCivilEntity> findAllCustom(){
		return estadoCivilService.findAllCustom();
	}
	
	@GetMapping("{id}")
	public EstadoCivilEntity findById(@PathVariable Long id) {
		return estadoCivilService.findById(id);
	}
	
	@PostMapping
	public EstadoCivilEntity add(@RequestBody	 EstadoCivilEntity eci) {
		return estadoCivilService.add(eci);
	}
	@PutMapping("{id}")
	public EstadoCivilEntity update(@RequestBody EstadoCivilEntity objsex,@PathVariable Long id) {
		return estadoCivilService.update(objsex, id);
	}
	
	@DeleteMapping("{id}")
	public EstadoCivilEntity delete(@PathVariable Long id) {
		return estadoCivilService.delete(id);
	}
	@PatchMapping("{id}")
	public EstadoCivilEntity enable(@PathVariable Long id) {
		return estadoCivilService.enable(id);
	}
}
