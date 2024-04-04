class ListaLigada {
    Nodo cabeza;

    public ListaLigada() {
        this.cabeza = null;
    }

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo valorTemporal = cabeza;
            while (valorTemporal.derecha != null) {
                valorTemporal = valorTemporal.derecha;
            }
            valorTemporal.derecha = nuevoNodo;
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.valor == valor) {
            cabeza = cabeza.derecha;
            return;
        }
        Nodo valorTemporal = cabeza;
        while (valorTemporal.derecha != null && valorTemporal.derecha.valor != valor) {
            valorTemporal = valorTemporal.derecha;
        }
        if (valorTemporal.derecha != null) {
            valorTemporal.derecha = valorTemporal.derecha.derecha;
        }
    }
}
    

