package com.example.colegio.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "profesor")
public class ProfesorEntity {
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "Profesor_id")
    private String profesorId;
    @Column(name = "dni")
    private String dni;
    @Column(name = "name")
    private String name;
    @Column(name = "birth_date")
    private String birthDate;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoEntity cursoId;
}
