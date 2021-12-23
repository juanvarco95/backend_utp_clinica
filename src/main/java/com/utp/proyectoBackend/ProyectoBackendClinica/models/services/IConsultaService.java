package com.utp.proyectoBackend.ProyectoBackendClinica.models.services;

import java.util.List;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;

public interface IConsultaService {

    List<Consulta> findAll();

    Consulta findById(Long id_c);

    Consulta save(Consulta consulta);

    public void delete(Long id);
    
}
