package com.asesoftware.CRUD.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.CRUD.reserva.entity.TurnosEntity;

public interface ITurnosRepository extends JpaRepository<TurnosEntity, Integer> {

}
