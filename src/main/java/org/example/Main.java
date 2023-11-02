package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Programa funcionando OK");
        System.out.println("-------------------------");
        System.out.println("");

        Alumno alumno = new Alumno(34092760, "Clara", "Cano", 5);
        Alumno alumno1 = new Alumno(45688400, "Fran", "Lanuti", 8.8);

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno);
        listaAlumnos.add(alumno1);

        Materia JavaInicial = new Materia(1l, "Java inicial", listaAlumnos);


        Inscripcion inscripcion = new Inscripcion(5l, JavaInicial, LocalDate.now());


        inscripcion.aprobada(45688400, JavaInicial);
    }
}