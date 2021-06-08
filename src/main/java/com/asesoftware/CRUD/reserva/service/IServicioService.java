package com.asesoftware.CRUD.reserva.service;

import java.util.List;

import com.asesoftware.CRUD.reserva.entity.ServiciosEntity;

public interface IServicioService {
	
    public List<ServiciosEntity> getAllService();
	
	public ServiciosEntity getServiceById(Integer id);
	
	public ServiciosEntity createService(ServiciosEntity servicioEntity);

	public ServiciosEntity updateService(ServiciosEntity servicioEntity);
	
	public void deleteService(Integer id);

}
