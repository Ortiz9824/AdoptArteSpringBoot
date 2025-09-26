package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.TamanoMascota;

@Repository
public interface TamanoMascotaRepository extends JpaRepository<TamanoMascota, Integer> {
}
