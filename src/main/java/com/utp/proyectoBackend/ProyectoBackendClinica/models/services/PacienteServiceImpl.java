package com.utp.proyectoBackend.ProyectoBackendClinica.models.services;

import java.util.List;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.dao.IPacienteDao;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    private IPacienteDao pacienteDao;

    @Override
    @Transactional
    public List<Paciente> findAll() {
        return (List<Paciente>) pacienteDao.findAll();
    }

    @Override
    public Paciente findById(Long id) {
        return pacienteDao.findById(id).orElse(null);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    @Override
    public void delete(Long id) {
        pacienteDao.deleteById(id);        
    }


    
    
}
