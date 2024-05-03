

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

}

