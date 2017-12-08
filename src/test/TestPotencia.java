package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controlador.CalculadoraLogica;

public class TestPotencia {

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
  public void potencia_prueba_1() {
    double resul = calc.potencia("5");
    double esperado = 25;
    assertEquals(esperado, resul, 0);
  }
      
  @Test
  public void potencia_prueba_2() {
    double resul = calc.potencia("-5");
    double esperado = 25;
    assertEquals(esperado, resul, 0);
  }

}
