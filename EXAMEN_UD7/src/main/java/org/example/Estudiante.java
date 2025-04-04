package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Estudiante {
    public String apellidos;
    public String nombre;
    public String curso;
    public int edad;

    public Estudiante(String apellidos, String nombre, String curso, int edad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.curso = curso;
        this.edad = edad;
    }
}
