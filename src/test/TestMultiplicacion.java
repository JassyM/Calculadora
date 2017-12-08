package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import controlador.CalculadoraLogica;



public class TestMultiplicacion {
    
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
  public void multiplicacion_prueba_1() {
    double resul = calc.multiplicacion("5", "5");
    double esperado = 25;
    assertEquals(esperado, resul, 0);
  }
    
  @Test
  public void multiplicacion_prueba_2() {
    double resul = calc.multiplicacion("-5", "-5");
    double esperado = 25;
    assertEquals(esperado, resul, 0);
  }

  @Test
  public void multiplicacion_prueba_3() {
    double resul = calc.multiplicacion("5", "-5");
    double esperado = -25;
    assertEquals(esperado, resul, 0);
  }
    
  @Test
  public void multiplicacion_prueba_4() {
    double resul = calc.multiplicacion("-5", "0");
    double esperado = 0;
    assertEquals(esperado, resul, 0);
  }
    
    
}
