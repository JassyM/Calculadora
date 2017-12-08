package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import controlador.CalculadoraLogica;

public class TestSuma {
    
  CalculadoraLogica calc;
    
  @Before
  public void setUp() throws Exception {
    calc = new CalculadoraLogica();
  }

  @After
  public void tearDown() throws Exception {
    calc = null;
  }
    
  @Before
  public void before() {
    calc = new CalculadoraLogica();
  }

  @Test
  public void prueba_suma_1() {
    double resul = calc.suma("100", "699");
    double esperado = 799;
    assertEquals(esperado, resul, 0);
  }

        
  @Test
  public void prueba_suma_2() {
    double resul = calc.suma("-3", "5");
    double esperado = 2;
    assertEquals(esperado, resul, 0);
  }
      
  @Test
  public void prueba_suma_3() {
    double resul = calc.suma("-5", "3");
    double esperado = -2;
    assertEquals(esperado, resul, 0);
  } 
    
    
}
