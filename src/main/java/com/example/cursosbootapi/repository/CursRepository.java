package com.example.cursosbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursosbootapi.entity.Curs;
public interface CursRepository extends JpaRepository<Curs, Integer> {
}
