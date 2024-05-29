package GestorNotas;

public class Principal {
    public static void main(String[] args) {
        // Creación de una instancia de GestorNotes
        GestorNotas gestorNotas = new GestorNotas();

        // Registra las notas de algunos alumnos
        // Me he equivocado en la sintaxi de notas xD
        gestorNotas.registrarNotss("Anna", new double[] {8.5, 9.0, 7.5});
        gestorNotas.registrarNotss("Joan", new double[] {6.0, 7.5, 8.0});
        gestorNotas.registrarNotss("Maria", new double[] {9.0, 8.5, 9.5});

        // Obtenemos y mostramos las notas de un alumno
        String nombreAlumne = "Anna";
        double[] notas = gestorNotas.obtenerNotas(nombreAlumne);
        System.out.println("Notas de " + nombreAlumne + ": " + Arrays.toString(notas));

        // Calculamos y mostramos las estadísticas de las notas del alumno
        double media = CalculadoraEstadistica.calcularMedia(notas);
        double maximo = CalculadoraEstadistica.calcularMaximo(notas);
        double minimo = CalculadoraEstadistica.calcularMinimo(notas);

        System.out.println("Media de las notas de " + nombreAlumne + ": " + media);
        System.out.println("Nota màxima de " + nombreAlumne + ": " + maximo);
        System.out.println("Nota mínima de " + nombreAlumne + ": " + minimo);

        
    }
}
