package com.example.cursosbootapi.controllers;


import com.example.cursosbootapi.repository.CursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class CursContoller {
        @Autowired
        private CursRepository cursDao;
        @GetMapping("cursos")
        public String cursos(Model model){
            model.addAttribute("cursos", cursDao.findAll());
            return "llista-cursos";
        }


}
