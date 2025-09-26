package com.proyectojpa.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyectojpa.demo.models.Usuario;
import com.proyectojpa.demo.repository.UsuarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String index() {
        return "login";
    }

    @PostMapping("/acceder")
    public String acceder(@RequestParam String usuario,
                         @RequestParam String password,
                         HttpSession session,
                         RedirectAttributes redirectAttributes) {
        
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(usuario);
        
        if (usuarioOptional.isPresent()) {
            Usuario usuarioEncontrado = usuarioOptional.get();
            
            // Verificar contraseña (en una implementación real usarías BCrypt)
            if (password.equals(usuarioEncontrado.getPassword())) {
                // Guardar datos de sesión
                session.setAttribute("usuario", usuarioEncontrado.getEmail());
                session.setAttribute("perfil", usuarioEncontrado.getRolId());
                
                // Redirección según perfil
                switch (usuarioEncontrado.getRolId()) {
                    case 1:
                        return "redirect:/usuarios";
                    case 2:
                    case 3:
                        return "redirect:/pagina-construccion";
                    case 4:
                        return "redirect:/adopcion";
                    case 5:
                        return "redirect:/afiliados";
                    default:
                        return "redirect:/login";
                }
            }
        }
        
        redirectAttributes.addFlashAttribute("mensaje", "Usuario o Contraseña incorrecta");
        return "redirect:/login";
    }

    @GetMapping("/salir")
    public String salir(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
