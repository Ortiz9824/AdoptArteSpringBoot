package com.proyectojpa.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MASCOTA")
    private Integer id;

    @Column(name = "NOMBRE_MASCOTA", length = 45)
    private String nombre;

    @Column(name = "RAZA_MASCOTA", length = 45)
    private String raza;

    @Column(name = "EDAD_MASCOTA", length = 4)
    private String edad;

    @Column(name = "DESCRIPCION", length = 300)
    private String descripcion;

    @Column(name = "Usuario_ID_USUARIO_ADMIN_REFUGIO")
    private Integer usuarioAdminRefugioId;

    @Column(name = "Evaluacion_medica_ID_EVALUACION")
    private Integer evaluacionMedicaId;

    @Column(name = "Solicitud_Adopcion_ID_SOLICITUD_ADOPCION")
    private Integer solicitudAdopcionId;

    @Column(name = "Especie_Mascota_ID_Especie_Mascota")
    private Integer especieMascotaId;

    @Column(name = "Tamaño_Mascota_ID_Tamaño_Mascota")
    private Integer tamanoMascotaId;

    @Column(name = "Estado_Mascota_ID_Estado_Mascota")
    private Integer estadoMascotaId;

    @Column(name = "URL_IMAGEN_MASCOTA")
    private String urlImagenMascota;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getUsuarioAdminRefugioId() {
        return usuarioAdminRefugioId;
    }

    public void setUsuarioAdminRefugioId(Integer usuarioAdminRefugioId) {
        this.usuarioAdminRefugioId = usuarioAdminRefugioId;
    }

    public Integer getEvaluacionMedicaId() {
        return evaluacionMedicaId;
    }

    public void setEvaluacionMedicaId(Integer evaluacionMedicaId) {
        this.evaluacionMedicaId = evaluacionMedicaId;
    }

    public Integer getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public void setSolicitudAdopcionId(Integer solicitudAdopcionId) {
        this.solicitudAdopcionId = solicitudAdopcionId;
    }

    public Integer getEspecieMascotaId() {
        return especieMascotaId;
    }

    public void setEspecieMascotaId(Integer especieMascotaId) {
        this.especieMascotaId = especieMascotaId;
    }

    public Integer getTamanoMascotaId() {
        return tamanoMascotaId;
    }

    public void setTamanoMascotaId(Integer tamanoMascotaId) {
        this.tamanoMascotaId = tamanoMascotaId;
    }

    public Integer getEstadoMascotaId() {
        return estadoMascotaId;
    }

    public void setEstadoMascotaId(Integer estadoMascotaId) {
        this.estadoMascotaId = estadoMascotaId;
    }

    public String getUrlImagenMascota() {
        return urlImagenMascota;
    }

    public void setUrlImagenMascota(String urlImagenMascota) {
        this.urlImagenMascota = urlImagenMascota;
    }
}
