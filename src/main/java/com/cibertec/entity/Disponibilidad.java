package com.cibertec.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "disponibilidad")
@Getter
@Setter

public class Disponibilidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDisponibilidad;
	
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima" )
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@JsonFormat(pattern = "HH:mm:ss", timezone="America/Lima" )
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Date horaFin;
	
	private String dia;
	
	@ManyToOne
	@JoinColumn(name = "idCiclo")
	private Ciclo ciclo;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
}
