import java.util.Scanner;

public class GestorTasques {
    
 
}

class Tasca{
    // Atributos
    private int id;
    private String prioridad;
    private boolean completa;

    // Constructores
    public Tasca(int id, String prioridad) {
        this.id = id;
        this.prioridad = prioridad;
        this.completa = false;
    }

    public int getId() {
        return id;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void marcarCompletada() {
        this.completa = true;
    }

    @Override // Sirve para hacer una redefinicion de codigo
    public String toString() {
        return "ID: " + id + ", Descripció: " + descripcio + ", Prioritat: " + prioritat + ", Completada: " + (completada ? "Sí" : "No");
    }
}

class main {
 private static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
        while (true) {
            System.out.print("Que desear hacer?? ");
            System.out.println("1.- Agregar nueva tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Borrar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Mostrar tareas con prioridad");
            System.out.println("6. Salir");

         int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    añadirTasca();
                    break;
                case 2:
                    marcarCompletada();
                    break;
                case 3:
                    borrarTasca();
                    break;
                case 4:
                    mostrarTasques();
                    break;
                case 5:
                    mostrarTasquesPrioritad();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, añadi una opcion de las mostradas en la lista");
            }

        }
    }
    
}
