package com.proyectojpa.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EVENTO")
    private Long idEvento;

    @Column(name = "NOMBRE_EVENTO", nullable = false)
    private String nombreEvento;

    @Column(name = "FECHA_EVENTO")
    private String fechaEvento;

    @Column(name = "DIRECCION_EVENTO")
    private String direccionEvento;

    @Column(name = "DESCRIPCION_EVENTO")
    private String descripcionEvento;

    @Lob
    @Column(name = "IMAGEN")
    private byte[] imagen;

    @Column(name = "Usuario_ID_USUARIO_ADMIN_REFUGIO")
    private Long usuarioAdminRefugio;

    // 👉 Getters y Setters (o puedes usar Lombok @Data si lo agregas en el pom.xml)
    public Long getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }
    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getDireccionEvento() {
        return direccionEvento;
    }
    public void setDireccionEvento(String direccionEvento) {
        this.direccionEvento = direccionEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }
    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public byte[] getImagen() {
        return imagen;
    }
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Long getUsuarioAdminRefugio() {
        return usuarioAdminRefugio;
    }
    public void setUsuarioAdminRefugio(Long usuarioAdminRefugio) {
        this.usuarioAdminRefugio = usuarioAdminRefugio;
    }
}
