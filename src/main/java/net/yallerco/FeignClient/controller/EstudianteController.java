package net.yallerco.FeignClient.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import net.yallerco.FeignClient.entity.EstudianteDTO;
import net.yallerco.FeignClient.service.EstudianteService;

@RestController
//@RequestMapping("/api/v1/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {
	
	private final EstudianteService estudianteService;
	
	@GetMapping
	public ResponseEntity<List<EstudianteDTO>> obtenerTodos(){
		return new ResponseEntity<>(estudianteService.obtenerTodos(), HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void crearEstudiante(@RequestBody EstudianteDTO estudiante) {
		estudianteService.crearEstudiante(estudiante);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void actualizarEstudiante(@PathVariable Integer id, @RequestBody EstudianteDTO estudiante) {
		estudianteService.actualizarPorId(id, estudiante);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void EliminarEstudiante(@PathVariable("id") Integer id) {
		estudianteService.eliminarPorId(id);
	}
	

}
