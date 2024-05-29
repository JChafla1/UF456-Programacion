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
    }
}
