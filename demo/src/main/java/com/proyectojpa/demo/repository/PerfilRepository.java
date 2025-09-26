package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
}
