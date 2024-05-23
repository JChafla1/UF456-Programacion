import java.util.Scanner;
import java.util.ArrayList;

class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<String> materias;

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }
    
}

public class Estudiantes {
    
}
