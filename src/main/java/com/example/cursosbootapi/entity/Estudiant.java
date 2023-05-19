package com.example.cursosbootapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
@Table(name = "estudiant")
public class Estudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estudiantId;
    private String estudiantNom;
    private  String estudiantCognom;
    private int estudiantCursId;


    public Estudiant() {}

    public Estudiant(int estudiantId, String estudiantNom, String estudiantCognom, int estudiantCursId) {
        this.estudiantId = estudiantId;
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
        this.estudiantCursId = estudiantCursId;
    }

    public Estudiant(String estudiantNom, String estudiantCognom, int estudiantCursId) {
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
        this.estudiantCursId = estudiantCursId;
    }

    public int getEstudiantId() {
        return estudiantId;
    }

    public void setEstudiantId(int estudiantId) {
        this.estudiantId = estudiantId;
    }

    public String getEstudiantNom() {
        return estudiantNom;
    }

    public void setEstudiantNom(String estudiantNom) {
        this.estudiantNom = estudiantNom;
    }

    public String getEstudiantCognom() {
        return estudiantCognom;
    }

    public void setEstudiantCognom(String estudiantCognom) {
        this.estudiantCognom = estudiantCognom;
    }

    public int getEstudiantCursId() {
        return estudiantCursId;
    }

    public void setEstudiantCursId(int estudiantCursId) {
        this.estudiantCursId = estudiantCursId;
    }

    @Override
    public String toString() {
        return "{" + estudiantId + ", " + estudiantNom + ", " + estudiantCognom + "}";
    }
}
