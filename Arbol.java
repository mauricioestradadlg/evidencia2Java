class Arbol {
    NodoArbol raiz;

    public Arbol() {
        this.raiz = new NodoArbol();
    }

    public void insertar(int valor) {
        raiz.insertar(valor);
    }

    public void eliminar(int valor) {
        raiz.eliminar(valor);
    }

    public void inorden() {
        raiz.inorden();
    }

    public void preorden() {
        raiz.preorden();
    }

    public void postorden() {
        raiz.postorden();
    }

    public Nodo buscar(int valor) {
        return raiz.buscar(valor);
    }
}