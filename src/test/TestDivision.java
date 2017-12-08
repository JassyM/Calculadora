package test;

import controlador.CalculadoraLogica;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDivision {
    
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
  public void prueba_division_1() {
    double resul = calc.division(5.0, 5.0);
    double esperado = 1;
    assertEquals(esperado, resul, 0.0005);
  }
    
  @Test()
  public void prueba_division_2() {
    double resul = calc.division(-5.0, -5.0);
    double esperado = 1;
    assertEquals(esperado, resul, 0.0005);
  }
  
  @Test()
  public void prueba_division_3() {
    double resul = calc.division(-5.0, 5.0);
    double esperado = -1;
    assertEquals(esperado, resul, 0.0005);
  }
    
  //Prueba de division por cero
  @Test(expected = ArithmeticException.class)
    public void division_cero() {
    calc.division(5.0, 0.0);
  }
    
    
}
