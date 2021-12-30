package com.utp.proyectoBackend.ProyectoBackendClinica.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "consulta")
public class Consulta implements Serializable {

    @Id
    // @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }
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

    
     @ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name = "paciente_id", nullable = false)
     @JsonBackReference
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createAt = createdAt;
    }
}