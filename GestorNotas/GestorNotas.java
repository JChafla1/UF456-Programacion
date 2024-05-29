package GestorNotas;

import java.util.HashMap;
import java.util.Map;

public class GestorNotas {
    // Atributos
    private Map<String, double[]> notasAlumnos;

    // Constructor
    public GestorNotas() {
        notasAlumnos = new HashMap<>();
    }

    // Registrar Notas
    public void registrarNotss(String nombreAlumno, double[] notas) {
        notasAlumnos.put(nombreAlumno, notas);
    }

    // Obtener notas
    public double[] obtenerNotas(String nombreAlumno) {
        return notasAlumnos.get(nombreAlumno);
    }
}
