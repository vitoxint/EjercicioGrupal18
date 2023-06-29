import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Test unitario sumar 2 valores")
    void testSumar() {
        Calculator c = new Calculator(55,45,0);
        c.sumar();
        assertEquals(100 , c.getResultado() , "La prueba falló. Resultado incorrecto.");

    }

    @Test
    @DisplayName("Test unitario restar 2 valores")
    void testRestar() {
        Calculator c = new Calculator(55,45,0);
        c.restar();
        assertEquals(10,c.getResultado(), "La prueba falló. Resultado incorrecto.");
    }

    @Test
    @DisplayName("Test unitario multiplicar 2 valores")
    void testMultiplicar() {
        Calculator c = new Calculator(24 ,5 ,0);
        c.multiplicar();
        assertEquals( 120,c.getResultado(),"La prueba falló. Resultado incorrecto");
    }

    @Test
    @DisplayName("Test unitario dividir 2 valores")
    void testDividir() {
        Calculator c = new Calculator(50,10,0);
        c.dividir();
        assertEquals(5, c.getResultado(), "La prueba falló. Resultado incorrecto");
    }

    @Test
    @DisplayName("Prueba división por cero")
    void testDivisionCero(){
        Calculator c = new Calculator(50,0,0);
        assertThrows( ArithmeticException.class , ()->{ c.dividir() ; }  );
    }

    @Test
    @DisplayName("Prueba potencia con base negativa y exponente < 1 y > 0 , o bien raiz con base negativa ")
    void testRaizNegativa(){
        Calculator c = new Calculator(-27,(double)1/3,0);
        assertThrows( ArithmeticException.class , ()->{c.potencia(); }  );
    }
    @Test
    @DisplayName("Prueba potencia con base positiva (raiz cúbica)")
    void testRaizPositiva(){
        Calculator c = new Calculator(27,(double)1/3,0);
        c.potencia();
        assertEquals( 3 , c.getResultado()  , "Resultado incorrecto" );
    }



}