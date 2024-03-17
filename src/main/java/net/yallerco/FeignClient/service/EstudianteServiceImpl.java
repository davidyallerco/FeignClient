package net.yallerco.FeignClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.yallerco.FeignClient.entity.EstudianteDTO;
import net.yallerco.FeignClient.feign.EstudianteFeignClient;

@Service
//@RequiredArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {
	
//	private final EstudianteFeignClient feignClient;//con @RequiredArgsConstructor no es necesario ya el @Autowired
	
	@Autowired
	private  EstudianteFeignClient feignClient;

	@Override
	public List<EstudianteDTO> obtenerTodos() {
		return feignClient.obtenerTodos();
	}

	@Override
	public void crearEstudiante(EstudianteDTO estudiante) {
		feignClient.crearEstudiante(estudiante);		
	}

	@Override
	public void actualizarPorId(Integer id, EstudianteDTO estudiante) {
		feignClient.actualizarEstudiante(id, estudiante);
	}

	@Override
	public void eliminarPorId(Integer id) {
		feignClient.eliminarPorId(id);
	}

}
