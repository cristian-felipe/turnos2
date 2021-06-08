package com.asesoftware.CRUD.reserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.CRUD.reserva.entity.ComerciosEntity;
import com.asesoftware.CRUD.reserva.service.IComerciosService;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComerciosController {
	
	@Autowired	
	private IComerciosService comercioService;
	
	@GetMapping(path = "/all")
	public List<ComerciosEntity> getAll(){
		return comercioService.getAll();
	}
	
	@GetMapping(path = "comercio/{id}")
	public ComerciosEntity getUsuarioById(@PathVariable Integer id) {
		return comercioService.getUsuarioById(id);
	}

	@PostMapping(path = "/crear",consumes ="application/json" ,produces = "application/json")
	public ComerciosEntity createUser(@RequestBody ComerciosEntity entity) {
		return comercioService.createUser(entity);
	}

	@PostMapping(path = "/editar",consumes ="application/json" ,produces = "application/json")
	public ComerciosEntity editarUser(@RequestBody ComerciosEntity entity) {
		return comercioService.updateUser(entity);
	}

	@GetMapping(path = "/delete/{id}")
	public void eliminarUsusario(@PathVariable Integer id) {
		 comercioService.deleteUser(id);
	}

}
