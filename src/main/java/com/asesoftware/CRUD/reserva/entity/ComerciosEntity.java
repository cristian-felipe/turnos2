package com.asesoftware.CRUD.reserva.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comercios")
public class ComerciosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nom_comercio")
	private String nom_comercio;
	
	@Column(name = "aforo_maximo")
	private Integer aforo_maximo;
	
	@OneToMany(mappedBy = "id_comercio")
	private List<ServiciosEntity> servicio;
	
}
