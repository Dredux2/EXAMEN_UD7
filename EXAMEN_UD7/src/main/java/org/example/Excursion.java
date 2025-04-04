package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;
@Getter @Setter @ToString
public class Excursion {
    static Scanner sc = new Scanner(System.in);
    private String nombreActividad;
    private String localidad;
    private double precio;
    private ArrayList<String> profesores = new ArrayList<>();
    private ArrayList<Estudiante> listaAsistentes = new ArrayList<>();

    public Excursion(String nombreActividad, String localidad, double precio) {
        this.nombreActividad = nombreActividad;
        this.localidad = localidad;
        this.precio = precio;
    }

    public void insertarProfesor(){
        System.out.println("Introduce el nombre del profesor/a para la excursion en " + localidad);
        String profesor = sc.nextLine();
        profesores.add(profesor);
    }

    public void inscribirAsistente(){
        System.out.println("Creando estudiante...");

        System.out.print("Inserta los apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Inserta el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Inserta el curso: ");
        String curso = sc.nextLine();

        System.out.print("Inserta su edad: ");
        int edad = 0;
        boolean var = false;
        while (!var){
            try {
                edad = sc.nextInt();
            } catch (InputMismatchException error){
                System.out.println("Edad Incorrecta, intentalo de nuevo.");
            }
            var = true;
        }
        Estudiante estudiante = new Estudiante(apellidos, nombre, curso, edad);

        if (!listaAsistentes.contains(estudiante)){
            listaAsistentes.add(estudiante);
            System.out.println("Añadido correctamente el estudiante " + nombre + " " + apellidos + " del curso " + curso);
        } else {
            System.out.println("El estudiante ya existe en la lista de asistentes a la actividad");
        }
    }

    public double calcularImporteIngreso(){
        return 0;
    }

    public void verAsistentes(){
        for (Estudiante estudiante : listaAsistentes){
            System.out.println(estudiante);
        }
    }

    public void eliminarAsistentes(int edad){
        for (Estudiante estudiante : listaAsistentes){
            if (estudiante.getEdad() < edad){
                listaAsistentes.remove(estudiante);
            }
        }
    }
}
