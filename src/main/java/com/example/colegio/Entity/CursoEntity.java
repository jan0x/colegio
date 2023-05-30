package com.example.colegio.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "curso")
public class CursoEntity {
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "Curso_id")
    private String cursoId;
    @Column(name = "name_curso")
    private String nameCurso;
    @Column(name = "horas_curso")
    private String horasCurso;

}
