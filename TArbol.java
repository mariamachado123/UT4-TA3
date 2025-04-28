public class TArbol<T extends Comparable<T>> {
    private TElemento<T> raiz;
    private int contadorInserciones;

    public int altura() {
        if (raiz == null) {
            return 0;
        }
        return raiz.alturaAux();
    }
    public int tamanio() {
        if (raiz == null) {
            return 0;
        }
        return raiz.tamanhoAux();
    }
    public boolean insertar(TElemento<T> unElemento) {

        if (esVacio()) {
            raiz = ((TElemento<T>) unElemento);
            contadorInserciones++;  // Incrementamos el contador
            System.out.println("Elemento insertado. Contador de inserciones: " + contadorInserciones);
            return true;
        } else {
            boolean resultado = raiz.insertar((TElemento<T>) unElemento);
            if (resultado) {
                contadorInserciones++;  // Incrementamos el contador
                System.out.println("Elemento insertado. Contador de inserciones: " + contadorInserciones);
            }
            return resultado;
        }
    }

    private boolean esVacio() {
        return raiz == null;
    }
}
