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
import pe.com.rapidosyfuriosos.entity.DistritoEntity;
import pe.com.rapidosyfuriosos.service.DistritoService;

@RestController
@RequestMapping("/api/distrito")
public class DistritoRestController {
	
	@Autowired
	private DistritoService distritoService;
	
	@GetMapping
	public List<DistritoEntity> findAll(){
		return distritoService.findAll();
	}
	@GetMapping("/custom")
	public List<DistritoEntity> findAllCustom(){
		return distritoService.findAllCustom();
	}
	@GetMapping("{id}")
	public DistritoEntity findById(@PathVariable Long id){
		return distritoService.findById(id);
	}
	@PostMapping
	public void add(@RequestBody DistritoEntity d) {
		distritoService.add(d);
	}
	@PutMapping("{id}")
	public DistritoEntity update(@PathVariable Long id,@RequestBody DistritoEntity d) {
		d.setCodigo(id);
		return distritoService.update(d,id);
	}
	
	@DeleteMapping("{id}")
	public DistritoEntity delete(@PathVariable Long id) {
		return distritoService.delete(id);
		
	}
	@PatchMapping("{id}")
	public DistritoEntity enable(@PathVariable Long id) {
		return distritoService.enable(id);
		
	}
}
