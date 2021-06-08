package com.asesoftware.CRUD.reserva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.CRUD.reserva.entity.ServiciosEntity;
import com.asesoftware.CRUD.reserva.repository.IServiciosRepository;

@Service
public class ServicioService implements IServicioService{
	@Autowired
	private IServiciosRepository serviceRepository;
	
	@Override
	public List<ServiciosEntity> getAllService(){
		
		return serviceRepository.findAll();
	}

	@Override
	public ServiciosEntity getServiceById(Integer id) {
		
		Optional<ServiciosEntity> optional = serviceRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}

	@Override
	public ServiciosEntity createService(ServiciosEntity serviceEntity) {
		
		return serviceRepository.save(serviceEntity);
	}

	@Override
	public ServiciosEntity updateService(ServiciosEntity servicioEntity) {
		
		return serviceRepository.save(servicioEntity);
	}

	@Override
	public void deleteService(Integer id) {
		
		serviceRepository.deleteById(id);
	}
}
