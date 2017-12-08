/**
Todos los derechos reservados
 * CalculadoraLogica.java
 *
 * Version 2.0 2/10/2017
 * 
 */

package controlador;

/**
* M�todos necesarios para resolver cada operaci�n (+, -, *, /, χ² √)
* @version 2.0 2/10/2017
* @author Andres Felipe Arana Lozano-Jassy Maribel Jaramillo Suarez-Natalia Rubiano Silva  
*/

public class CalculadoraLogica {
    
  String numero1; // Primer valor introducido en la calculadora
  String numero2; // Segundo valor introducido en la calculadora
  
  /**
  * Metodo que retorna el valor de la suma
  * @param n1 y n2 son los valores con los que se va realizar la suma.
  * @return El valor de la suma.
  */
  public Double suma(String n1, String n2) {
    numero1 = n1;
    numero2 = n2;
    Double valor = 0.0;
    valor = Double.parseDouble(numero1) + Double.parseDouble(numero2);
    return valor;
  }

  /**
   * Metodo que retorna el valor de la resta
   * @param n1 y n2 son los valores con los que se va realizar la resta.
   * @return El valor de la resta.
  */
  public Double resta(String n1, String n2) {
    numero1 = n1;
    numero2 = n2;
    Double valor = 0.0;
    valor = Double.parseDouble(numero1) - Double.parseDouble(numero2);
    return valor;
  }

  /**
  * Método que retorna el valor de la multiplicación.
  * @param n1 y n2 son los valores con los que se va realizar la multiplicación.
  * @return El valor de la multiplicación.
  */
  public Double multiplicacion(String n1, String n2) {
    numero1 = n1;
    numero2 = n2;
    Double valor = 0.0;
    valor = Double.parseDouble(numero1) * Double.parseDouble(numero2);
    return valor;
  }
 
  /**
  * Método que retorna el valor de la división
  * @param n1 y n2 son los valores con los que se va realizar la división.
  * @return El valor de la división.
  */
  public Double division(Double n1, Double n2) {
      Double valor = 0.0;
      if (n2 == 0) {
	    throw new ArithmeticException();
      } else {	    
    numero1 = n1.toString();
    numero2 = n2.toString();
    
    valor = Double.parseDouble(numero1) / Double.parseDouble(numero2);
      }
    return valor;
  }
  
  /**
  * Método que retorna el cuadrado de un número.
  * @param n es el valor que se eleva al cuadrado.
  * @return El valor del número elevado al cuadrado.
  */
  public Double potencia(String n) {
    numero1 = n;
    Double valor = 0.0;
    valor = Math.pow(Double.parseDouble(numero1), 2);
    return valor;
  }

  /**
   * M�todo que retorna raíz de un n�mero.
   * @param n es el valor que se le saca ra�z cuadrada.
   * @return El valor de la ra�z cuadrada del n�mero.
   */
  public Double raiz(Double n) {
    Double valor = 0.0;
    Double numero;
    numero1 = n.toString();
    if (n < 0) {
	    throw new ArithmeticException();
  } else {	 
    
    numero = Double.parseDouble(numero1);
    if (numero >= 0) {
      valor = Math.sqrt(numero);
    }
  }
    return valor;
  }
}
