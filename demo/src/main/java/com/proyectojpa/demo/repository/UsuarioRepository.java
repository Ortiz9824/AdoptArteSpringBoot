package com.proyectojpa.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectojpa.demo.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Puedes agregar métodos personalizados como:
    Optional<Usuario> findByEmail(String email);
}
