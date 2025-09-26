package com.proyectojpa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectojpa.demo.models.Mascotas;
import com.proyectojpa.demo.repository.MascotaRepository;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/adopcion")
public class AdopcionController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @GetMapping
    public String index(@RequestParam(required = false) String tipo,
                       @RequestParam(required = false) String raza,
                       @RequestParam(required = false) String orden,
                       @RequestParam(required = false) String buscar,
                       Model model) {
        
        List<Mascotas> mascotas = mascotaRepository.findAll();
        
        // Aplicar filtros (simplificado - en una implementación real usarías consultas JPA)
        if (tipo != null && !tipo.isEmpty()) {
            // Filtrar por tipo de especie
        }
        
        if (raza != null && !raza.isEmpty()) {
            // Filtrar por raza
        }
        
        if (buscar != null && !buscar.isEmpty()) {
            // Filtrar por búsqueda
        }
        
        if (orden != null) {
            if ("az".equals(orden)) {
                // Ordenar A-Z
            } else if ("za".equals(orden)) {
                // Ordenar Z-A
            }
        }
        
        model.addAttribute("mascotas", mascotas);
        return "adopcion";
    }

    @GetMapping("/detalle/{id}")
    public String detalle(@PathVariable Integer id, Model model) {
        Optional<Mascotas> mascota = mascotaRepository.findById(id);
        
        if (mascota.isEmpty()) {
            return "error/404";
        }
        
        model.addAttribute("mascota", mascota.get());
        return "detalle_mascota";
    }

    @GetMapping("/procesar-adopcion/{id}")
    public String procesarAdopcion(@PathVariable Integer id, 
                                 HttpSession session) {
        Integer perfil = (Integer) session.getAttribute("perfil");
        
        // Verificar permisos (roles 4 y 5 pueden adoptar)
        if (perfil == null || (perfil != 4 && perfil != 5)) {
            return "redirect:/login";
        }
        
        // Lógica de procesamiento de adopción
        // Por ahora redirigir a página en construcción
        return "redirect:/pagina-construccion";
    }
}
