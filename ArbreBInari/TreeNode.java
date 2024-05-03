public class TreeNode {
    private Object data;
    private TreeNode izquierda;
    private TreeNode derecha;
    private int maxDepth;

    public TreeNode(Object data, int maxDepth) {
        this.data = data;
        this.maxDepth = maxDepth;
        this.izquierda = null;
        this.derecha = null;
    }

    // 2 arboles, 2 nodos, main
    
    // GETTERS 
    public Object getData() {
        return data;
    }

    public TreeNode getIzquierda() {
        return izquierda;
    }

    public TreeNode getDerecha() {
        return izquierda;
    }

    public int getMaxDepth(){
        return maxDepth;
    }
    
    // SETTERS

    public void setData(Object data) {
        this.data = data;
    }   

    public void setIzquierda(Treenode izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(Treenode derecha) {
        this.derecha = derecha;
    }
    
    public void setMaxdepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }


}

