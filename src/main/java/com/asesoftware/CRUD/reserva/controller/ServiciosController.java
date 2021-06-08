package com.asesoftware.CRUD.reserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.CRUD.reserva.entity.ServiciosEntity;
import com.asesoftware.CRUD.reserva.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicios")
public class ServiciosController {
	@Autowired
	private IServicioService servicioService;
	
	@GetMapping(path = "/all")
	public List<ServiciosEntity> todosServicios(){
		return servicioService.getAllService();
	}
	
	@GetMapping(path = "/servicio/{id}")
	public ServiciosEntity unUsusario(@PathVariable Integer id) {
		return servicioService.getServiceById(id);
	}
	
	@PostMapping(path = "/crear", consumes ="application/json" ,produces = "application/json")
	public ServiciosEntity crearUsusario(@RequestBody ServiciosEntity entity) {
		return servicioService.createService(entity);
	}

	@PostMapping(path = "/editar", consumes ="application/json" ,produces = "application/json")
	public ServiciosEntity actualizarServicio(@RequestBody ServiciosEntity entity) {
		return servicioService.createService(entity);
	}
	
	@GetMapping(path = "/delete/{id}")
	public void eliminarServicio(@PathVariable Integer id) {
		 servicioService.deleteService(id);
	}
}
