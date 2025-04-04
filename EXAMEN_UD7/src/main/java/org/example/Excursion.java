package org.example;

import java.util.Collection;

public class Excursion {
    private String nombreActividad;
    private String localidad;
    private double precio;
    Collection<String> profesores;
    Collection<Estudiante> listaAsistentes;

    public Excursion(String nombreActividad, String localidad, double precio, Collection<String> profesores, Collection<Estudiante> listaAsistentes) {
        this.nombreActividad = nombreActividad;
        this.localidad = localidad;
        this.precio = precio;
        this.profesores = profesores;
        this.listaAsistentes = listaAsistentes;
    }

    public static void insertarProfesor(){

    }

    public static void inscribirAsistente(){

    }

    public static double calcularImporteIngreso(){

    }

    public static void verAsistentes(){

    }

    public static void eliminarAsistentes(int edad){

    }
}
