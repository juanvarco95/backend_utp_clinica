package com.utp.proyectoBackend.ProyectoBackendClinica.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.utp.proyectoBackend.ProyectoBackendClinica.models.entity.Paciente;
import com.utp.proyectoBackend.ProyectoBackendClinica.models.services.IPacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/clinica")
public class PacienteRestController {
    
    @Autowired
    private IPacienteService pacienteService;

    @GetMapping("/pacientes")
    public List<Paciente> index() {
        return pacienteService.findAll();
    }

    @GetMapping("/pacientes/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Paciente paciente = null;
        Map<String, Object> response = new HashMap<>();

        try {
            paciente = pacienteService.findById(id);
        } catch (DataAccessException e) {
            response.put("error", "Error al hacer la consulta en la base de datos.");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        if(paciente == null) {
            response.put("mensaje", "El paciente ID: ".concat(id.toString().concat("no existe en la base de datos!")));
        }
        
        return new ResponseEntity<Paciente>(paciente, HttpStatus.OK);
    }
    
    @PostMapping("/pacientes")
    public ResponseEntity<?> create(@RequestBody Paciente paciente) {
        Map<String, Object> response = new HashMap<>();
        
        try {
            paciente = pacienteService.save(paciente);
        } catch (DataAccessException e) {
            response.put("error", "Error al hacer la consulta en la base de datos.");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Paciente>(paciente, HttpStatus.CREATED);
    }
    
    @PutMapping("/pacientes/id")
    public ResponseEntity<?> update(@RequestBody Paciente paciente, @PathVariable Long id) {
        Paciente pacienteActual = pacienteService.findById(id);
        Paciente pacienteActualizado = null;
        
        Map<String, Object> response = new HashMap<>();
        
        if(pacienteActual == null) {
            response.put("mensaje", "Error: no se pudo encontrar el cliente ID: ".concat(id.toString().concat(" no existe en la base de datos!.")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        try {
            pacienteActual.setNombre(paciente.getNombre());
            pacienteActual.setApellido(paciente.getApellido());
            

        } catch (Exception e) {
            //TODO: handle exception
        }
        return null;


    }
}
