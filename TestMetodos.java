import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMetodos {
    private static TArbol arbol;

    @BeforeEach
    public void setUp(){
        arbol = new TArbol();
        arbol.insertar(new TElemento(4));
        arbol.insertar(new TElemento(2));
        arbol.insertar(new TElemento(1));
        arbol.insertar(new TElemento(5));
        arbol.insertar(new TElemento(6));
        arbol.insertar(new TElemento(7));
    }

    @Test
    public void testTamanhoAux() {
        assertEquals(6, arbol.getRaiz().tamanhoAux());
    }

    @Test
    public void testAlturaAux() {
        assertEquals(3, arbol.getRaiz().alturaAux());
    }

}