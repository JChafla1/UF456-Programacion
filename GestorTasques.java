import java.util.Scanner;

public class GestorTasques {
 
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
