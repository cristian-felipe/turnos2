package com.asesoftware.CRUD.reserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.CRUD.reserva.entity.ComerciosEntity;
import com.asesoftware.CRUD.reserva.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService{

	@Autowired
	private IComerciosRepository comerciosRepository;
	@Override
	public List<ComerciosEntity> getAll() {
		
		return comerciosRepository.findAll();
	}

	@Override
	public ComerciosEntity getUsuarioById(Integer id) {
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}

	@Override
	public ComerciosEntity createUser(ComerciosEntity comerciosEntity) {
		
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public ComerciosEntity updateUser(ComerciosEntity comerciosEntity) {
		
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public void deleteUser(Integer id) {
		
		comerciosRepository.deleteById(id);
	}
}
