package com.asesoftware.CRUD.reserva.service;

import java.util.List;

import com.asesoftware.CRUD.reserva.entity.TurnosEntity;

public interface ITurnosService {
	
	public List<TurnosEntity> getAllTurn();
	
	public TurnosEntity getTurnById(Integer id);
	
	public TurnosEntity createTurn(TurnosEntity turnoEntity);
	
	public TurnosEntity updateTurn(TurnosEntity turnoEntity);
	
	public void deleteTurn(Integer id);

}
