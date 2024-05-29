package GestorNotas;

public class CalculadoraEstadistica {
    
    // métodos estáticos para calcular diferentes estadísticas sobre un conjunto de notas
    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
