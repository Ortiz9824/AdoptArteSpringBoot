package com.proyectojpa.demo.controller;

import com.proyectojpa.demo.models.Evento;
import com.proyectojpa.demo.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public String listarEventos(Model model) {
        List<Evento> eventos = eventoRepository.findAll();
        model.addAttribute("eventos", eventos);
        return "eventos"; // Thymeleaf buscará templates/eventos.html
    }
}
