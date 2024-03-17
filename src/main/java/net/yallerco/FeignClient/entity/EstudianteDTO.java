package net.yallerco.FeignClient.entity;

import lombok.Data;

@Data
public class EstudianteDTO {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;

}
