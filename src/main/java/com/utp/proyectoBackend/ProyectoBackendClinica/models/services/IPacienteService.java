package com.utp.proyectoBackend.ProyectoBackendClinica.models.services;

import java.util.List;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Paciente;

public interface IPacienteService {

    List<Paciente> findAll();

    public Paciente findById(Long id);

    public Paciente save(Paciente paciente);

    public void delete(Paciente paciente);

    public Consulta findConsultaById(Long id);

    public Consulta saveConsulta(Consulta consulta);

    public void deleteConsultaById(Long id);

    
}
