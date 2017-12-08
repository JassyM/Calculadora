package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controlador.CalculadoraLogica;

public class TestResta {

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
  public void prueba_resta_1() {
    double resul = calc.resta("10", "5");
    double esperado = 5;
    assertEquals(esperado, resul, 0);
  }
      
  @Test
  public void prueba_resta_2() {
    double resul = calc.resta("3", "5");
    double esperado = -2;
    assertEquals(esperado, resul, 0);
  }
    
  @Test
  public void prueba_resta_3() {
    double resul = calc.resta("5", "5");
    double esperado = 0;
    assertEquals(esperado, resul, 0);
  }  

}
