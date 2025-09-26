package com.proyectojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectojpa.demo.models.Evento;
public interface EventoRepository extends JpaRepository<Evento, Long> {
}