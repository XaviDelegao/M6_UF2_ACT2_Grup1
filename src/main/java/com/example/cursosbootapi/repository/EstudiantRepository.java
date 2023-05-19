package com.example.cursosbootapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursosbootapi.entity.Estudiant;
public interface EstudiantRepository extends JpaRepository<Estudiant, Integer> {


}
