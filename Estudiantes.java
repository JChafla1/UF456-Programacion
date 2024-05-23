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
        boolean salir = false;

        while (!salir) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1.- Introducir estudiante");
            System.out.println("2.- Introducir materia a estudiante existente");
            System.out.println("3.- Eliminar materia de estudiante existente");
            System.out.println("4.- Mostrar todos los estudiantes registrados");
            System.out.println("5.- Mostrar les matèries d'un estudiant especifico");
            System.out.println("6.- Salir");

            int opcio = scanner.nextInt();
            scanner.nextLine();

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    introducirEstudiante();
                    break;
                case 2:
                    introducirMateriaEstudiante();
                    break;
                case 3:
                    eliminarMateriaEstudiante();
                    break;
                case 4:
                    mostrarEstudiantes();
                    break;
                case 5:
                    mostrarMateriesEstudiante();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, introduce una opcion de la lista");
                    break;
            }
        }
        
        scanner.close();
    }

    private static void introducirEstudiante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nova línia

        Estudiante estudiante = new Estudiante(nombre, apellido, edad);
        estudiantes.put(nombre + " " + apellido, estudiante);
        System.out.println("Estudiant añadido correctamente");
    }

    private static void introducirMateriaEstudiante() {
        System.out.print("Nombre completo del estudiante: ");
        String nomComplet = scanner.nextLine();
        Estudiante estudiante = estudiantes.get(nomComplet);

        if (estudiante != null) {
            System.out.print("Matèria a afegir: ");
            String materia = scanner.nextLine();
            estudiante.introducirMateria(materia);
            System.out.println("Matèria afegida correctament.");
        } else {
            System.out.println("Estudiant no trobat.");
        }
    }


}
