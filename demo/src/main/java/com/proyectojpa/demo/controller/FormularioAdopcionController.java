package com.proyectojpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyectojpa.demo.models.FormularioAdopcion;
import com.proyectojpa.demo.repository.FormularioAdopcionRepository;

@Controller
@RequestMapping("/formulario")
public class FormularioAdopcionController {

    @Autowired
    private FormularioAdopcionRepository formularioRepo;

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("formularioAdopcion", new FormularioAdopcion());
        return "formulario-adopcion";
    }

    @PostMapping
    public String guardarFormulario(@Validated @ModelAttribute("formularioAdopcion") FormularioAdopcion formulario,
            BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            return "formulario-adopcion";
        }

        formularioRepo.save(formulario);
        model.addAttribute("exito", true);
        return "formulario-adopcion";
    }
}
