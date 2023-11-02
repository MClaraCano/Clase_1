package org.example;

import java.time.LocalDate;
import java.util.List;

public class Inscripcion {

    private Long idInscripcion;
    private Materia materia;
    private LocalDate fecha;


    public Inscripcion() {
    }

    public Inscripcion(Long idInscripcion, Materia materia, LocalDate fecha) {
        this.idInscripcion = idInscripcion;
        this.materia = materia;
        this.fecha = fecha;
    }

    public Long getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Long idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Alumno buscarAlumno(int dniAlumno, Materia materia){
        List<Alumno> listaAlumnosPorMateria = materia.getAlumnoList();
        Alumno unAlumno = new Alumno();

        for (Alumno alumno : listaAlumnosPorMateria){
            if (alumno.getDni() == dniAlumno){
                unAlumno = alumno;
                System.out.println("El alumno con DNI " + dniAlumno + " es:" + alumno);
            }
        } return unAlumno;
    }



    public boolean aprobada(int dniAlumno, Materia materia){

        boolean aprobada = false;
        Alumno alumnoPorDni = buscarAlumno(dniAlumno, materia);

        if (alumnoPorDni.getNota() >= 7) {
            System.out.println("Materia aprobada: " + materia.getNombre() + ". Puede inscribirse a Java intermedio.");
            aprobada = true;
        } else {
            System.out.println("Materia no aprobada. Inscripción denegada.");
            aprobada = false;
        }
            return aprobada;
        }



}
