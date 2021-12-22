package com.utp.proyectoBackend.ProyectoBackendClinica.models.dao;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Paciente;

import org.springframework.data.repository.CrudRepository;

public interface IPacienteDao extends CrudRepository<Paciente, Long>{
    
}
