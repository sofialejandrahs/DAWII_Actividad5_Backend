package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Disponibilidad;

public interface DisponibilidadService {

	public Disponibilidad registrarDisponibilidad(Disponibilidad obj);
	public List<Disponibilidad> listaDisponibilidad();
}
