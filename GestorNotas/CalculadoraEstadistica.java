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

    // Calcula la nota máxima en el array notes
    public static double calcularMaximo(double[] notas) {
        double maximo = notas[0];
        for (double nota : notas) {
            if (nota > maximo) {
                maximo = nota;
            }
        }
        return maximo;
    }

    // Minimo
    public static double calcularMinimo(double[] notas) {
        double minimo = notas[0];
        for (double nota : notas) {
            if (nota < minimo) {
                minimo = nota;
            }
        }
        return minimo;
    }
}
