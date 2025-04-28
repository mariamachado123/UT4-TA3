public class TElemento<T extends Comparable<T>> {
    private T dato;
    private TElemento<T> izquierda;
    private TElemento<T> derecha;

    public TElemento(T dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public TElemento<T> getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(TElemento<T> izquierda) {
        this.izquierda = izquierda;
    }
    public TElemento<T> getDerecha() {
        return derecha;
    }
    public void setDerecha(TElemento<T> derecha) {
        this.derecha = derecha;
    }

    public int alturaAux() {
        if (this.getIzquierda() == null && this.getDerecha() == null) {
            return 0;
        }
        else {
            int izq = (this.getIzquierda() != null) ? this.getIzquierda().alturaAux() : -1;
            int der = (this.getDerecha() != null) ? this.getDerecha().alturaAux() : -1;
            return 1 + Math.max(izq, der);
        }

    }
    public int tamanhoAux() {
        int cantidad = 1;
        if (this.getIzquierda() == null && this.getDerecha() == null) {
            return 1;
        }
        else {
            if (this.getIzquierda() != null) {
                cantidad += this.getIzquierda().tamanhoAux(); // Sumo el tamaño del subárbol izquierdo
            }

            if (this.getDerecha() != null) {
                cantidad += this.getDerecha().tamanhoAux(); // Sumo el tamaño del subárbol derecho
            }

            return cantidad;
        }

    }
    public boolean esVacio(){
        return izquierda == null && derecha == null;
    }

    public boolean insertar(TElemento<T> unElemento) {
        if (unElemento.getDato().compareTo(dato) < 0) {
            if (izquierda != null) {
                return getIzquierda().insertar(unElemento);
            } else {
                izquierda= unElemento;
                return true;
            }
        } else if (unElemento.getDato().compareTo(dato) > 0) {
            if (derecha != null) {
                return getDerecha().insertar(unElemento);
            } else {
                derecha = unElemento;
                return true;
            }
        } else {
            return false;
        }
    }


}
