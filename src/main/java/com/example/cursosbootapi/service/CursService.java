package com.example.cursosbootapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cursosbootapi.repository.CursRepository;
import com.example.cursosbootapi.entity.Curs;

import java.util.List;

@Service
public class CursService {

    private static CursRepository cursDao;

    @Autowired
    public CursService(CursRepository cursRepository) {
        this.cursDao = cursRepository;
    }

    public static List<Curs> llistaCursos() {
        return cursDao.findAll();
    }



}
