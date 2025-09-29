package com.proyectojpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.proyectojpa.demo.models.Usuario;
import com.proyectojpa.demo.repository.UsuarioRepository;

@Controller
@RequestMapping("/registrar")
public class RegistroController {

    @Autowired
    private UsuarioRepository usuarioRepo;

    private BCryptPasswordEncoder passwordEncoder = new BCryptasswordEncoder();

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "Registrar"; // tu plantilla HTML con el diseño original
    }

    @PostMapping("/guardar")
    public String guardar(@Validated @ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {

        if (usuarioRepo.existsByEmail(usuario.getEmail())) {
            result.rejectValue("email", "error.usuario", "El correo ya está registrado. Intenta con otro.");
        }

        if (usuarioRepo.existsByDocumento(usuario.getDocumento())) {
            result.rejectValue("documento", "error.usuario", "El número de documento ya está registrado.");
        }

        if (result.hasErrors()) {
            return "Registrar"; // vuelve con errores
        }

        // encriptar la contraseña
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setRolId(4); // adoptante por defecto

        usuarioRepo.save(usuario);

        model.addAttribute("success", "Registro exitoso. Inicia sesión.");
        return "login"; // redirige a la vista de login
    }
}
