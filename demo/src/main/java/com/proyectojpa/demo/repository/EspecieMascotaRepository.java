package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.EspecieMascota;

@Repository
public interface EspecieMascotaRepository extends JpaRepository<EspecieMascota, Integer> {
}
