package com.utp.proyectoBackend.ProyectoBackendClinica.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {
    // Información Personal
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String tipoDocumento;

    @Column(nullable = false, unique = true)
    private Long documento;

    private Date fechaNacimiento;
    private String lugarNacimiento;
    private String genero;

    @Column(name = "ocupacion_hobbies", length = 300)
    private String ocupacionHobbies;
    private String estadoCivil;
    private String religion;

    @Column(name = "lugar_procedencia")
    private String lugarProcedencia;

    @Column(name = "lugar_residencia")
    private String lugarResidencia;
    
    @Column(name = "tipo_sangre")
    private String tipoSangre;

    private String EPS;
    private Long acompañanteTelefono;
    private String confiabilidad;
    private String servicio;
    private String lugar;
   

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacionHobbies() {
        return ocupacionHobbies;
    }

    public void setOcupacionHobbies(String ocupacionHobbies) {
        this.ocupacionHobbies = ocupacionHobbies;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String ePS) {
        EPS = ePS;
    }

    public Long getAcompañanteTelefono() {
        return acompañanteTelefono;
    }

    public void setAcompañanteTelefono(Long acompañanteTelefono) {
        this.acompañanteTelefono = acompañanteTelefono;
    }

    public String getConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(String confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

  

}
