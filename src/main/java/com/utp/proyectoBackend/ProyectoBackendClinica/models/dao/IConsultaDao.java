package com.utp.proyectoBackend.ProyectoBackendClinica.models.dao;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;

import org.springframework.data.repository.CrudRepository;

public interface IConsultaDao extends CrudRepository<Consulta, Long> {
    
}
