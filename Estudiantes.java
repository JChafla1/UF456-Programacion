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

    // Metodos de manipulacion
    public void introducirMateria(String materia) {
        materias.add(materia);
    }

    public void eliminarMateria(String materia) {
        materias.remove(materia);
    }
    
}

public class RegistroEstudiantes {
    private static HashMap<String, Estudiante> estudiantes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    
}
