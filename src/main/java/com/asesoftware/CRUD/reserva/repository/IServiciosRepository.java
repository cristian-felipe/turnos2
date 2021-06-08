package com.asesoftware.CRUD.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.CRUD.reserva.entity.ServiciosEntity;

public interface IServiciosRepository extends JpaRepository<ServiciosEntity, Integer>{

}
