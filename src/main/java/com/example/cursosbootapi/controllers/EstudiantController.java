package com.example.cursosbootapi.controllers;


import com.example.cursosbootapi.entity.Estudiant;
import com.example.cursosbootapi.repository.EstudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.cursosbootapi.entity.Curs;
import com.example.cursosbootapi.service.CursService;

import java.util.List;

@Controller
@RequestMapping("api")
public class EstudiantController {

    @Autowired
    private EstudiantRepository estudiantDao;
    @GetMapping("estudiants")
    public String cursos(Model model){
        model.addAttribute("estudiants", estudiantDao.findAll());
        return "llista-estudiants";
    }

    @GetMapping("/estudiants/nou")
    public String nouEstudiant(Model model){
        Estudiant estudiant = new Estudiant();
        model.addAttribute("estudiant", estudiant);
        List<Curs> cursos = CursService.llistaCursos();

        // Agregar la lista de cursos al modelo
        model.addAttribute("cursos", cursos);

        return "nou-estudiant";

    }

    @PostMapping("estudiants/alta")
    public String altaProjecte(Estudiant estudiant){
        System.out.println(estudiant);
        estudiantDao.save(estudiant);

        return "redirect:/api/estudiants";
    }
}
