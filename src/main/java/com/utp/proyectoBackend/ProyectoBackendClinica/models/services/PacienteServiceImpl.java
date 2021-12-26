package com.utp.proyectoBackend.ProyectoBackendClinica.models.services;

import java.util.List;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.dao.IConsultaDao;
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

    @Autowired
    private IConsultaDao consultaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll() {
        return (List<Paciente>) pacienteDao.findAll();
    }
    
    @Override
    @Transactional(readOnly = true)
    public Paciente findById(Long id) {
        return pacienteDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public Paciente save(Paciente paciente) {
        return pacienteDao.save(paciente);
    }
    
    @Override
    @Transactional
    public void delete(Paciente paciente) {
        pacienteDao.delete(paciente);        
    }

    @Override
    @Transactional(readOnly = true)
    public Consulta findConsultaById(Long id) {
        return consultaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Consulta saveConsulta(Consulta consulta) {
        return consultaDao.save(consulta);
    }

    @Override
    @Transactional
    public void deleteConsultaById(Long id) {
        consultaDao.deleteById(id);
    }
    
    
}
