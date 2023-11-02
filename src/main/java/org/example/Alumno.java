package org.example;

import java.time.LocalDate;

public class Alumno {

    private Integer dni;
    private String nombre;
    private String apellido;

    private double nota;

    public Alumno() {
    }

    public Alumno(Integer dni, String nombre, String apellido, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nota=" + nota +
                '}';
    }
}
