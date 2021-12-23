package com.utp.proyectoBackend.ProyectoBackendClinica.models.services;

import java.util.List;

import javax.transaction.Transactional;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.dao.IConsultaDao;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiceImpl implements IConsultaService{

    @Autowired
    private IConsultaDao consultaDao;

    @Override
    @Transactional
    public List<Consulta> findAll() {
        return (List<Consulta>) consultaDao.findAll();
    }

    @Override
    public Consulta findById(Long id_c) {
        return consultaDao.findById(id_c).orElse(null);
    }

    @Override
    public Consulta save(Consulta consulta) {
        return consultaDao.save(consulta);
    }

    @Override
    public void delete(Long id) {
        consultaDao.deleteById(id);
    }
   
}
