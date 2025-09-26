package com.proyectojpa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyectojpa.demo.models.Mascotas;
import com.proyectojpa.demo.repository.MascotaRepository;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @GetMapping("/vista-mascotas")
    public String mostrarMascotas(Model model) {
        List<Mascotas> mascotas = mascotaRepository.findAll();
        model.addAttribute("mascotas", mascotas);
        // Aquí puedes agregar lógica para obtener las mascotas y pasarlas al modelo si es necesario
        return "mascotas";  // Thymeleaf buscará mascotas.html
    }

}
