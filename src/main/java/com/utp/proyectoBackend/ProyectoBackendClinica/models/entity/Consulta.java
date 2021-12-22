package com.utp.proyectoBackend.ProyectoBackendClinica.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     // Motivo de Consulta
     @Column(name = "motivo_consulta", length = 600)
     private String motivoConsulta;
     
     // Antecedentes
     @Column(name = "patologicos_personales", length = 600)
     private String patologicosPersonales;
 
     @Column(name = "toxicos_personales", length = 600)
     private String toxicosPersonales;
 
     @Column(name = "alergicos_personales", length = 600)
     private String alergicosPersonales;
 
     @Column(name = "farmacologicos_personales", length = 600)
     private String farmacologicosPersonales;
 
     @Column(name = "patologicos_familiares", length = 600)
     private String patologicosFamiliares;
     
     // Diagnosticos
     @Column(name = "diagnostico", length = 600)
     private String diagnostico;
 
     @Column( length = 600)
     private String conducta;

     //  @JoinColumn(name = "id")
     @ManyToOne(cascade = CascadeType.ALL)
     private Paciente paciente;

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getPatologicosPersonales() {
        return patologicosPersonales;
    }

    public void setPatologicosPersonales(String patologicosPersonales) {
        this.patologicosPersonales = patologicosPersonales;
    }

    public String getToxicosPersonales() {
        return toxicosPersonales;
    }

    public void setToxicosPersonales(String toxicosPersonales) {
        this.toxicosPersonales = toxicosPersonales;
    }

    public String getAlergicosPersonales() {
        return alergicosPersonales;
    }

    public void setAlergicosPersonales(String alergicosPersonales) {
        this.alergicosPersonales = alergicosPersonales;
    }

    public String getFarmacologicosPersonales() {
        return farmacologicosPersonales;
    }

    public void setFarmacologicosPersonales(String farmacologicosPersonales) {
        this.farmacologicosPersonales = farmacologicosPersonales;
    }

    public String getPatologicosFamiliares() {
        return patologicosFamiliares;
    }

    public void setPatologicosFamiliares(String patologicosFamiliares) {
        this.patologicosFamiliares = patologicosFamiliares;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
