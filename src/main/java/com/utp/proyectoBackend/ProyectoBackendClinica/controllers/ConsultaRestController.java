package com.utp.proyectoBackend.ProyectoBackendClinica.controllers;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Consulta;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.services.IPacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/clinica")

public class ConsultaRestController {
    
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping("/consultas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Consulta show(@PathVariable Long id) {
        return pacienteService.findConsultaById(id);
    }   

    @DeleteMapping("/consultas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        pacienteService.deleteConsultaById(id);
    }

    @PostMapping("/consultas")
    @ResponseStatus(HttpStatus.CREATED)
    public Consulta create(@RequestBody Consulta consulta) {
        return pacienteService.saveConsulta(consulta);
    }
}
