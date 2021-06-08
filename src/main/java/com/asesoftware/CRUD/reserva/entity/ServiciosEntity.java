package com.asesoftware.CRUD.reserva.entity;

import java.sql.Time;
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
@Table(name = "servicios")
public class ServiciosEntity {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private Time hora_apertura;
	
	@Column(name = "hora_cierre")
	private Time hora_cierre;
	
	@Column(name = "duracion")
	private Integer duracion;
	
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@OneToMany(mappedBy = "id_servicio")
	private List<TurnosEntity> turno;
}
