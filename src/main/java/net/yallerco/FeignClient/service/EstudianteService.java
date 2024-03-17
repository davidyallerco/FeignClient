package net.yallerco.FeignClient.service;

import java.util.List;

import net.yallerco.FeignClient.entity.EstudianteDTO;


public interface EstudianteService {

	public List<EstudianteDTO> obtenerTodos();

	public void crearEstudiante(EstudianteDTO estudiante);

	public void actualizarPorId(Integer id, EstudianteDTO estudiante);

	public void eliminarPorId(Integer id);

}
