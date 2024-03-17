package net.yallerco.FeignClient.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import net.yallerco.FeignClient.entity.EstudianteDTO;

//@FeignClient(name = "ESTUDIANTE-MOCK-API", url = "${external.mock.base-url}", configuration = FeignClientConfiguration.class)
@FeignClient(name = "ESTUDIANTE-MOCK-API", url = "${external.mock.base-url}")
public interface EstudianteFeignClient {

	@GetMapping(value = "/api/v1/Estudiantes", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<EstudianteDTO> obtenerTodos();
	
	@PostMapping(value = "/api/v1/Estudiantes", consumes = MediaType.APPLICATION_JSON_VALUE)
	void crearEstudiante(EstudianteDTO estudiante);
	
	@PutMapping(value = "/api/v1/Estudiantes/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void actualizarEstudiante(@PathVariable Integer id, @RequestBody EstudianteDTO estudiante);
	
	@DeleteMapping(value = "/api/v1/Estudiantes/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void eliminarPorId(@PathVariable Integer id);


}
