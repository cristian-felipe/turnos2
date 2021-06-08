package com.asesoftware.CRUD.reserva.service;

import java.util.List;

import com.asesoftware.CRUD.reserva.entity.ComerciosEntity;

public interface IComerciosService {
	
	public List<ComerciosEntity> getAll();
	
	public ComerciosEntity getUsuarioById(Integer id);
	
	public ComerciosEntity createUser(ComerciosEntity comerciosEntity);

	public ComerciosEntity updateUser(ComerciosEntity comerciosEntity);
	
	public void deleteUser(Integer id);
}
