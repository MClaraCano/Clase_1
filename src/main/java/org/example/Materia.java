package org.example;

import java.util.List;

public class Materia {

    private Long idMateria;
    private String nombre;

    private List<Alumno> alumnoList;


    public Materia() {
    }

    public Materia(Long idMateria, String nombre, List<Alumno> alumnoList) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.alumnoList = alumnoList;
    }

    public Materia(Long idMateria, String nombre) {
        this.idMateria = idMateria;
        this.nombre = nombre;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "idMateria=" + idMateria +
                ", nombre='" + nombre + '\'' +
                ", alumnoList=" + alumnoList +
                '}';
    }
}
