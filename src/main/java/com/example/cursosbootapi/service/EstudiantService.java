package com.example.cursosbootapi.service;

import java.util.List;
import java.util.Optional;

import com.example.cursosbootapi.entity.Estudiant;
import com.example.cursosbootapi.repository.CursRepository;
import com.example.cursosbootapi.repository.EstudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cursosbootapi.exceptions.ResourceNotFoundException;
import com.example.cursosbootapi.entity.*;
import com.example.cursosbootapi.repository.*;

@Service
public class EstudiantService {
    @Autowired
    private EstudiantRepository studentRepository;

    @Autowired
    private CursRepository cursRepository;

    public List<Estudiant> getStudents() {
        return studentRepository.findAll();
    }

    public Estudiant getStudentsById(int id) {
        Optional<Estudiant> student = studentRepository.findById(id);
        return student.get();
    }

    public Estudiant saveStudent(Estudiant student) {
        return studentRepository.save(student);
    }

    public Estudiant updateStudent(Estudiant student)
            throws ResourceNotFoundException {
        Optional<Estudiant> oldStudent = studentRepository.findById(student.getEstudiantId());
        if (!oldStudent.isPresent()) {
            throw new ResourceNotFoundException("Resource Not Found!!!!");
        } else {
            Estudiant studentToUpdate = oldStudent.get();
            studentToUpdate.setEstudiantNom(student.getEstudiantNom());
            studentToUpdate.setEstudiantCognom(student.getEstudiantCognom());
            Estudiant updatedStudent = studentRepository.save(studentToUpdate);
            return updatedStudent;
        }
    }
}
