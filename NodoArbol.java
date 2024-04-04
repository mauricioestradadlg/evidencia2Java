

class NodoArbol {

    Nodo raiz;

    public NodoArbol() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }
        if (valor < raiz.valor) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertarRecursivo(raiz.derecha, valor);
        }
        return raiz;
    }

    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            inordenRecursivo(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            inordenRecursivo(raiz.derecha);
        }
    }

    public void preorden() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preordenRecursivo(raiz.izquierda);
            preordenRecursivo(raiz.derecha);
        }
    }

    public void postorden() {
        postordenRecursivo(raiz);
    }

    private void postordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            postordenRecursivo(raiz.izquierda);
            postordenRecursivo(raiz.derecha);
            System.out.print(raiz.valor + " ");
        }
    }

    public Nodo buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private Nodo buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null || raiz.valor == valor) {
            return raiz;
        }
        if (valor < raiz.valor) {
            return buscarRecursivo(raiz.izquierda, valor);
        }
        return buscarRecursivo(raiz.derecha, valor);
    }

    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return null;
        }
        if (valor < raiz.valor) {
            raiz.izquierda = eliminarRecursivo(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = eliminarRecursivo(raiz.derecha, valor);
        } else {
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }
            raiz.valor = minimoValor(raiz.derecha);
            raiz.derecha = eliminarRecursivo(raiz.derecha, raiz.valor);
        }
        return raiz;
    }

    private int minimoValor(Nodo raiz) {
        int valorMinimo = raiz.valor;
        while (raiz.izquierda != null) {
            valorMinimo = raiz.izquierda.valor;
            raiz = raiz.izquierda;
        }
        return valorMinimo;
    }
}
