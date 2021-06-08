package com.asesoftware.CRUD.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.CRUD.reserva.entity.ComerciosEntity;

public interface IComerciosRepository extends JpaRepository<ComerciosEntity, Integer>{

}
