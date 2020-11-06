package curso.es;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void prueba1Suma() {
        int resultado=App.suma(4,7);
        int esperado=11;
        assertTrue( resultado == esperado );
    }   
    
    @Test
    public void prueba2Suma() {
        int resultado=App.suma(4,7);
        int esperado=11;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba3Suma() {
        int resultado=App.suma(4,-7);
        int esperado=-3;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba4Suma() {
        int resultado=App.suma(-4,7);
        int esperado=3;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba5Suma() {
        int resultado=App.suma(-4,-7);
        int esperado=-11;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba6Suma() {
        int resultado=App.suma(0,-7);
        int esperado=-7;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba7Suma() {
        int resultado=App.suma(0,7);
        int esperado=7;
        assertTrue( resultado == esperado );
    }
    @Test
    public void prueba8Suma() {
        int resultado=App.suma(4,0);
        int esperado=4;
        assertTrue( resultado == esperado );
    }
    
     @Test
    public void pruebaApp() {
        new App();
    }
}
