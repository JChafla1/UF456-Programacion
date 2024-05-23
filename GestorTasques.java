import java.util.Scanner;
import java.util.ArrayList;

public class GestorTasques {
    private ArrayList<Tasca> listaTascas;
    private int nextId;

    public GestorTasques() {
        this.listaTascas = new ArrayList<>();
        this.nextId = 1;
    }

    public void añadirTasca(String prioridad) {
        Tasca tasca = new Tasca(nextId++, prioridad);
        listaTascas.add(tasca);
        System.out.println("Tasca afegida correctament.");
    }

    public void marcarCompletada(int id) {
        for (Tasca tasca : listaTascas) {
            if (tasca.getId() == id) {
                tasca.marcarCompletada();
                System.out.println("Tasca marcada como completada");
                return;
            }
        }
        System.out.println("Tasca no encontrada.");
    }

    public void borrarTasca(int id) {
        listaTascas.removeIf(tasca -> tasca.getId() == id);
        System.out.println("Tasca borrada correctamente");
    }

    public void mostrarTasques() {
        if (listaTascas.isEmpty()) {
            System.out.println("No hi ha tasques per mostrar.");
        } else {
            for (Tasca tasca : listaTascas) {
                System.out.println(tasca);
            }
        }
    }

    public void mostrarTasquesPrioridad(String prioridad) {
        for (Tasca tasca : listaTascas) {
            if (tasca.getPrioridad().equalsIgnoreCase(prioridad)) {
                System.out.println(tasca);
            }
        }
    }
 
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
        return "ID: " + id + ", Prioritad: " + prioridad + ", Completada: " + (completa ? "Sí" : "No");
    }
}

class main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestorTasques gestor = new GestorTasques();

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

    private static void añadirTasca() {
        System.out.print("Introdueix la prioritat (baixa, mitjana, alta): ");
        String prioridad = scanner.nextLine();
        gestor.añadirTasca(prioridad);
    }
    
}
