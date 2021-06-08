package com.asesoftware.CRUD.reserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.CRUD.reserva.entity.TurnosEntity;
import com.asesoftware.CRUD.reserva.repository.ITurnosRepository;

@Service
public class TurnosService implements ITurnosService{

	@Autowired
	private ITurnosRepository turnoRepository;
	
	@Override
	public List<TurnosEntity> getAllTurn() {
		
		return turnoRepository.findAll();
	}

	@Override
	public TurnosEntity getTurnById(Integer id) {
		
		Optional<TurnosEntity> optional = turnoRepository.findById(id);
		
		if (optional.isPresent()) {
			return optional.get() ;
		}else {
			return null;
		}
		
		
	}

	@Override
	public TurnosEntity createTurn(TurnosEntity turnoEntity) {
		
		try {
			return turnoRepository.save(turnoEntity);
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public TurnosEntity updateTurn(TurnosEntity turnoEntity) {
		return turnoRepository.save(turnoEntity);
	}

	@Override
	public void deleteTurn(Integer id) {
		
		turnoRepository.deleteById(id);
		
	}
}
