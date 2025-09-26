package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.EstadoMascota;

@Repository
public interface EstadoMascotaRepository extends JpaRepository<EstadoMascota, Integer> {
}
