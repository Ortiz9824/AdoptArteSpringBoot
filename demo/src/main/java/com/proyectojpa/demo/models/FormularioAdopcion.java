package com.proyectojpa.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "formulario_adopcion")
public class FormularioAdopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORMULARIO")
    private Integer id;

    @Column(name = "CIUDAD", length = 100)
    private String ciudad;

    @Column(name = "LOCALIDAD", length = 100)
    private String localidad;

    @Column(name = "BARRIO", length = 100)
    private String barrio;

    @Column(name = "OCUPACION", length = 100)
    private String ocupacion;

    @Column(name = "NUM_DE_PERSONAS_CONVIVE")
    private Integer numPersonasConvive;

    @Column(name = "OBSERVACIONES", length = 500)
    private String observaciones;

    @Column(name = "Usuario_ID_USUARIO_ADOPTANTE")
    private Integer usuarioAdoptanteId;

    @Column(name = "Tipo_Vivienda_idTipo_Vivienda")
    private Integer tipoViviendaId;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getNumPersonasConvive() {
        return numPersonasConvive;
    }

    public void setNumPersonasConvive(Integer numPersonasConvive) {
        this.numPersonasConvive = numPersonasConvive;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getUsuarioAdoptanteId() {
        return usuarioAdoptanteId;
    }

    public void setUsuarioAdoptanteId(Integer usuarioAdoptanteId) {
        this.usuarioAdoptanteId = usuarioAdoptanteId;
    }

    public Integer getTipoViviendaId() {
        return tipoViviendaId;
    }

    public void setTipoViviendaId(Integer tipoViviendaId) {
        this.tipoViviendaId = tipoViviendaId;
    }
}
