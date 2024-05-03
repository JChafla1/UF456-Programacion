import java.util.*;

public class ArbreBinari {
    private TreeNode root;
    private int profundidad;
    private static int instanceCount = 0; //Contador de instancias


    // Sin especificar la profundidad
    public ArbreBinari(){
        instanceCount++;
        root = null;
        profundidad = 0;
    }

    // Especificando la profundidad
    public ArbreBinari(int profundidad) {
        instanceCount++;
        root = null;
        this.profundidad = profundidad;
    }

    // GETTERS Y SETTERS
    public int getProfundidad(){
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }

    // Metodo para insertar elementos balanceadamente
    public void insertarBalanceado(List<Intenger> elementos) {
        this.root = construirArbreBalanceat(elementos, 0, elementos.size() - 1);
    }

    // Metodo recursivo para construir un arbol binario
    private TreeNode construirArbreBalanceat(List<Integer> elementos, int inicio, int fin){
        if (inicio > fin) {
            return null;
        }

        int medio = (inicio + fin) / 2;
        TreeNode nodo = new TreeNode(elementos.get(medio), this.profundidad);

        nodo.setIzquierda(construirArbreBalanceat(elementos, inicio, medio - 1));
        nodo.setDerecha(construirArbreBalanceat(elementos, inicio, medio - 1));

        return nodo;
    }

}
