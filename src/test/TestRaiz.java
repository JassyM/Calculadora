package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import controlador.CalculadoraLogica;



public class TestRaiz {
    
  CalculadoraLogica calc;
    
  @Before
  public void setUp() throws Exception {
    calc = new CalculadoraLogica();
  }

  @After
  public void tearDown() throws Exception {
    calc = null;
  }

  @Test
  public void raiz_prueba_1() {
    double resul = calc.raiz(100.0);
    double esperado = 10;
    assertEquals(esperado, resul, 0.0005);
  }

  @Test(expected = ArithmeticException.class)
    public void raiz_prueba_2() {
    calc.raiz(-4.0);
  }
    
    
}
