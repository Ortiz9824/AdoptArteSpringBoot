package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.Mascotas;

@Repository
public interface MascotaRepository extends JpaRepository<Mascotas, Integer> {

    // Puedes agregar métodos personalizados como:
    Mascotas findByNombre(String nombre);

}
