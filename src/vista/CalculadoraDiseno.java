/**
Todos los derechos reservados
 * CalculadoraDiseño.java
 *
 * Version 3.1 1/10/2017
 * 
 */

package vista;

import controlador.CalculadoraLogica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 * Interfaz de la aplicación.
 * 
 * @version 3.1 1 Oct 2017
 * @author Andrés Felipe Arana Lozano-Jassy Maribel Jaramillo Suárez-Natalia Rubiano Silva
 * 
 */

public class CalculadoraDiseno extends JFrame {

  //Variables de la clase
  private JPanel contentPane;
  private JTextField campoNumero1; // Campo de Texto donde se escribe los números y la operación a realizar.
  private JLabel campoNumero2; // Label donde se almacena cada valor digitalizado.
  private String numero1; // Primer valor introducido en el campo de Texto.
  private String numero2; // Segundo valor introducido en el campo de Texto.
  private String valorTotal; // Almacena el valor que se va a mostrar en el label.
  private int operacion; // Operación a realizar: 1->Suma, 2->Resta, 3->Multiplicación, 4->División
  private boolean algunaOperacion; // Almacena si ya se ha realizado alguna operación
  private Double memoria; // Valor de memoria.
  private static final long serialVersionUID = 1L;
  private CalculadoraLogica objCalculadoraLogica; // Objeto de la clase calculadorLogica.java
  /**
  * Launch the application.
  */

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CalculadoraDiseno frame = new CalculadoraDiseno();
          frame.setVisible(true);
          frame.setLocationRelativeTo(null);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
  * Create the frame.
  */
  public CalculadoraDiseno() {
    valorTotal = "";
    operacion = 0;
    setResizable(false);
    this.setTitle("Calculadora");
    setMinimumSize(new Dimension(410, 500));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.window);
    contentPane.setSize(new Dimension(410, 500));
    contentPane.setMinimumSize(new Dimension(410, 500));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    JPanel panelInicio = new JPanel();
    panelInicio.setBackground(Color.WHITE);
    panelInicio.setBounds(22, 52, 405, 404);
    contentPane.add(panelInicio);
    panelInicio.setLayout(null);
    campoNumero1 = new JTextField();
    campoNumero1.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) {
        char car = e.getKeyChar();
        {
          if (campoNumero1.getText().length() >= 8) {
            e.consume();
          }
        }
        {
          if (car < '0' || car > '9') {
            e.consume();
          }
        }
      }
    });
    campoNumero1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
    campoNumero1.setBounds(37, 63, 333, 37);
    campoNumero1.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
    campoNumero1.setForeground(Color.BLACK);
    campoNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
    panelInicio.add(campoNumero1);
    campoNumero1.setColumns(10);

    /*
    * Creación del Label
    */
    campoNumero2 = new JLabel("");
    campoNumero2.setBounds(27, 26, 340, 49);
    campoNumero2.setFont(new Font("DejaVu Sans", Font.BOLD, 18));
    campoNumero2.setForeground(Color.GRAY);
    campoNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
    panelInicio.add(campoNumero2);

    JPanel panelBotones = new JPanel();
    panelBotones.setBounds(37, 102, 336, 282);
    panelInicio.add(panelBotones);
    panelBotones.setBackground(Color.WHITE);
    panelBotones.setLayout(null);
    JButton boton0 = new JButton("0");
    boton0.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton0.setBorder(null);
    boton0.setBackground(SystemColor.inactiveCaptionBorder);
    boton0.setForeground(Color.BLACK);
    boton0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "0");  // Evento del botón cero.
      }
    });
    boton0.setBounds(12, 223, 60, 50);
    panelBotones.add(boton0);

    /* Botón 1 */
    JButton boton1 = new JButton("1");
    boton1.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton1.setBorder(null);
    boton1.setBackground(SystemColor.inactiveCaptionBorder);
    boton1.setForeground(Color.BLACK);
    boton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "1"); // Evento del botón uno.
      }
    });
    boton1.setBounds(12, 168, 60, 50);
    panelBotones.add(boton1);
    
    /* Botón 2 */
    JButton boton2 = new JButton("2");
    boton2.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton2.setBorder(null);
    boton2.setBackground(SystemColor.inactiveCaptionBorder);
    boton2.setForeground(Color.BLACK);
    boton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "2"); // Evento del botón dos.
      }
    });
    boton2.setBounds(75, 168, 60, 50);
    panelBotones.add(boton2);
    
    /* Botón 3 */
    JButton boton3 = new JButton("3");
    boton3.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton3.setBorder(null);
    boton3.setBackground(SystemColor.inactiveCaptionBorder);
    boton3.setForeground(Color.BLACK);
    boton3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "3"); // Evento del botón tres.
        }
      });
    boton3.setBounds(138, 168, 60, 50);
    panelBotones.add(boton3);
	
    /* Botón 4 */
    JButton boton4 = new JButton("4");
    boton4.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton4.setBorder(null);
    boton4.setBackground(SystemColor.inactiveCaptionBorder);
    boton4.setForeground(Color.BLACK);
    boton4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "4"); // Evento del botón cuatro.
      }
    });
    boton4.setBounds(12, 114, 60, 50);
    panelBotones.add(boton4);
    
    /* Botón Cinco */
    JButton boton5 = new JButton("5");
    boton5.setFont(new Font("DejaVu Sans", Font.BOLD, 14));	
    boton5.setBorder(null);
    boton5.setBackground(SystemColor.inactiveCaptionBorder);
    boton5.setForeground(Color.BLACK);
    boton5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "5"); // Evento del botón cinco.
      }
    });
    boton5.setBounds(75, 114, 60, 50);
    panelBotones.add(boton5);
    
    /* Botón Seis */
    JButton boton6 = new JButton("6");
    boton6.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton6.setBorder(null);

    boton6.setBackground(SystemColor.inactiveCaptionBorder);
    boton6.setForeground(Color.BLACK);
    boton6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "6"); // Evento del botón seis.
      }
    });
    boton6.setBounds(138, 114, 60, 50);
    panelBotones.add(boton6);
    
    /* Botón Siete */
    JButton boton7 = new JButton("7");
    boton7.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton7.setBorder(null);
    boton7.setBackground(SystemColor.inactiveCaptionBorder);
    boton7.setForeground(Color.BLACK);
    boton7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "7"); // Evento del botón siete.
      }
    });
    boton7.setBounds(12, 60, 60, 50);
    panelBotones.add(boton7);
    
    /* Botón Ocho */
    JButton boton8 = new JButton("8");
    boton8.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton8.setBorder(null);
    boton8.setBackground(SystemColor.inactiveCaptionBorder);
    boton8.setForeground(Color.BLACK);
    boton8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "8"); // Evento del botón ocho.
      }
    });
    boton8.setBounds(75, 60, 60, 50);
    panelBotones.add(boton8);
    
    /* Boton Nueve*/
    JButton boton9 = new JButton("9");
    boton9.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    boton9.setBorder(null);
    boton9.setBackground(SystemColor.inactiveCaptionBorder);
    boton9.setForeground(Color.BLACK);
    boton9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText(campoNumero1.getText() + "9"); // Evento del botón nueve.
      }
    });
    boton9.setBounds(138, 60, 60, 50);
    panelBotones.add(boton9);
    
    /*
    * Botones Memoria
    */

    /* Botón M+ */
    JButton botonMemoriaMas = new JButton("M+");
    botonMemoriaMas.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMemoriaMas.setBorder(null);
    botonMemoriaMas.setBackground(SystemColor.window);
    botonMemoriaMas.setForeground(Color.BLACK);
    botonMemoriaMas.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) {
	  memoria += Double.parseDouble(campoNumero1.getText()); /* Evento del Botón "M+" suma el dato con el que 
        está en memoria. */
      }
    });
    botonMemoriaMas.setEnabled(false);
    botonMemoriaMas.setBounds(75, 12, 60, 36);
    panelBotones.add(botonMemoriaMas);
    
    /* Botón M- */
    JButton botonMemoriaMenos = new JButton("M-");
    botonMemoriaMenos.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMemoriaMenos.setBorder(null);
    botonMemoriaMenos.setBackground(SystemColor.window);
    botonMemoriaMenos.setForeground(Color.BLACK);
    botonMemoriaMenos.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) {
	  memoria -= Double.parseDouble(campoNumero1.getText()); /* Evento del Botón "M-" Resta el dato con el que 
        está en memoria.*/
      }
    });
    botonMemoriaMenos.setEnabled(false);
    botonMemoriaMenos.setBounds(138, 12, 60, 36);
    panelBotones.add(botonMemoriaMenos);
    
    /* Botón M */
    JButton botonMemoriaM = new JButton("M");
    botonMemoriaM.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMemoriaM.setBorder(null);
    botonMemoriaM.setBackground(SystemColor.window);
    botonMemoriaM.setForeground(Color.BLACK);
    botonMemoriaM.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (campoNumero1.getText().length() > 0) {
            memoria = Double.parseDouble(campoNumero1.getText()); /* Evento del Botón "M" Almacena el dato en memoria.*/
          botonMemoriaMas.setEnabled(true);
          botonMemoriaMenos.setEnabled(true);
        }
      }
    });
    botonMemoriaM.setBounds(12, 12, 60, 36);
    panelBotones.add(botonMemoriaM);
    
    /* Botón MC */
    JButton botonMemoriaMC = new JButton("MC");
    botonMemoriaMC.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMemoriaMC.setBorder(null);
    botonMemoriaMC.setBackground(SystemColor.window);
    botonMemoriaMC.setForeground(Color.BLACK);
    botonMemoriaMC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText("");
        campoNumero2.setText(""); /* Evento del Botón "MC" Borra lo que está en memoria. */
        memoria = 0.0;
        botonMemoriaMas.setEnabled(false);
        botonMemoriaMenos.setEnabled(false);
      }
    });
    botonMemoriaMC.setBounds(264, 12, 60, 36);
    panelBotones.add(botonMemoriaMC);
    
    /* Botón MR */
    JButton botonMemoriaMR = new JButton("MR");
    botonMemoriaMR.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMemoriaMR.setBorder(null);
    botonMemoriaMR.setBackground(SystemColor.window);
    botonMemoriaMR.setForeground(Color.BLACK);
    botonMemoriaMR.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero2.setText("");
        campoNumero1.setText(String.valueOf(memoria));/* Evento del Botón "MR" Muestra lo que está en memoria. */
      }
    });
    botonMemoriaMR.setBounds(201, 12, 60, 36);
    panelBotones.add(botonMemoriaMR);
    
    /*
    * Botón Punto
    */
    JButton botonPunto = new JButton(".");
    botonPunto.setBackground(SystemColor.window);
    botonPunto.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonPunto.setBorder(null);
    botonPunto.setForeground(Color.BLACK);
    botonPunto.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { /* Evento del botón "punto" */
        String numero = campoNumero1.getText();
        if (numero.length() == 0) {
          campoNumero1.setText("0."); /* Se añade un cero y despues el punto si el campo de texto está vacío. */
        } else {
          if (!punto()) { /* Añade un punto al campo de texto si no hay puntos antes */
            campoNumero1.setText(campoNumero1.getText() + ".");
          }
        }
      }
    });
    botonPunto.setBounds(75, 223, 60, 50);
    panelBotones.add(botonPunto);
    JButton botonC = new JButton("C");
    botonC.setBackground(SystemColor.window);
    botonC.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonC.setBorder(null);
    botonC.setForeground(Color.BLACK);
    botonC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        campoNumero1.setText("");
        campoNumero2.setText("");
        operacion = 0;
        numero1 = "";
        numero2 = "";
        valorTotal = "";
        memoria = 0.0;
      }
    });
    botonC.setBounds(138, 223, 60, 50);
    panelBotones.add(botonC);

    /*
    * Botón Igual
    */
    JButton botonIgual = new JButton("");
    botonIgual.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/igual.png")));
    botonIgual.setBackground(SystemColor.window);
    botonIgual.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonIgual.setBorder(null);
    botonIgual.setForeground(Color.BLACK);
    botonIgual.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { /* Evento del botón "Igual". */
        if (!campoNumero1.getText().equals("")) {
          if (operacion != 0) { /* Realiza la operación correspondiente si se ha introducido alguna operación */
            algunaOperacion = true;
            numero2 = campoNumero1.getText();
            objCalculadoraLogica = new CalculadoraLogica();
            Double v = 0.0; /* Según la operación que se realice: 1->Suma, 2->Resta, 3->Multiplicación, 4->División */
            if (operacion == 1) {	/* se llama la función correspondiente a cada operación */
              v = objCalculadoraLogica.suma(numero1, numero2);
            } else if (operacion == 2) {
              v = objCalculadoraLogica.resta(numero1, numero2);
            } else if (operacion == 3) {
              v = objCalculadoraLogica.multiplicacion(numero1, numero2);
            } else if (operacion == 4) {
              v = objCalculadoraLogica.division(Double.parseDouble(numero1), Double.parseDouble(numero2));
            }
            operacion = 0;
            valorTotal = campoNumero2.getText() + campoNumero1.getText();
            campoNumero2.setText(valorTotal);
            campoNumero1.setText(Double.toString(v));
          }
        }
      }
    });
    botonIgual.setBounds(201, 223, 123, 50);
    panelBotones.add(botonIgual);
    
    /*
    * Botones de Operaciones
    */

    /*Botón Suma */
    JButton botonSuma = new JButton("");
    botonSuma.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/mas.png")));
    botonSuma.setBackground(SystemColor.window);
    botonSuma.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonSuma.setBorder(null);
    botonSuma.setForeground(Color.BLACK);
    botonSuma.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { // Eventon del botón mas "+"
        botonOperacion(1, "+");
      }
    });
    botonSuma.setBounds(201, 168, 60, 50);
    panelBotones.add(botonSuma);
    
    /*Botón Resta */
    JButton botonResta = new JButton("");
    botonResta.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/menos.png")));
    botonResta.setBackground(SystemColor.window);
    botonResta.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonResta.setBorder(null);
    botonResta.setForeground(Color.BLACK);
    botonResta.addActionListener(new ActionListener() { /* Eventon del botón menos "-" */
      public void actionPerformed(ActionEvent e) {
        botonOperacion(2, "-");
      }
    });
    botonResta.setBounds(264, 168, 60, 50);
    panelBotones.add(botonResta);
    
    /*Botón Multiplicación */
    JButton botonMultiplicacion = new JButton("");
    botonMultiplicacion.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/multiplicar.png")));
    botonMultiplicacion.setBackground(SystemColor.window);
    botonMultiplicacion.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonMultiplicacion.setBorder(null);
    botonMultiplicacion.setForeground(Color.BLACK);
    botonMultiplicacion.addActionListener(new ActionListener() { /* Eventon del botón multiplicación "x" */
      public void actionPerformed(ActionEvent e) {
        botonOperacion(3, "x");
      }
    });
    botonMultiplicacion.setBounds(201, 114, 60, 50);
    panelBotones.add(botonMultiplicacion);
    /*Botón División */
    JButton botonDivision = new JButton("");
    botonDivision.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/division.png")));
    botonDivision.setBackground(SystemColor.window);
    botonDivision.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonDivision.setBorder(null);
    botonDivision.setForeground(Color.BLACK);
    botonDivision.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { /* Eventon del botón división "÷" */
        botonOperacion(4, "/");
      }
    });
    botonDivision.setBounds(264, 114, 60, 50);
    panelBotones.add(botonDivision);
    
    /*Botón Potencia dos*/
    JButton botonPotencia = new JButton("");
    botonPotencia.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/cuadrado.png")));
    botonPotencia.setBackground(SystemColor.window);
    botonPotencia.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonPotencia.setBorder(null);
    botonPotencia.setForeground(Color.BLACK);
    botonPotencia.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { /* Eventon del botón base al cuadrado "χ²" */
        if (!campoNumero1.getText().equals("Error")) {
          String numero = campoNumero1.getText();
          int cantidad = numero.length();
          if (cantidad > 0) {
            numero1 = numero;
            campoNumero1.setText("");
            campoNumero2.setText(numero1 + "^2");
            objCalculadoraLogica = new CalculadoraLogica(); /* Se llama la función correspondiente a la operación χ² */
            String resultado = objCalculadoraLogica.potencia(numero1).toString();
            campoNumero1.setText(resultado);
          }
        } else {
          campoNumero1.setText("");
          campoNumero2.setText("");
        }
      }
    });
    botonPotencia.setBounds(201, 60, 60, 50);
    panelBotones.add(botonPotencia);
    
    /*Botón Raíz Cuadrada*/
    JButton botonRaiz = new JButton("");
    botonRaiz.setIcon(new ImageIcon(CalculadoraDiseno.class.getResource("/icon/raiz-cuadrada.png")));
    botonRaiz.setBackground(SystemColor.window);
    botonRaiz.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
    botonRaiz.setBorder(null);
    botonRaiz.setForeground(Color.BLACK);
    botonRaiz.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { /* Evento del botón Raíz cuadrada "√" */
        String numero = campoNumero1.getText();
        if (!campoNumero1.getText().equals("Error")) { /* Si el campo de texto no tiene error, 
          realiza la operación indicada */
          int cantidad = numero.length();
          if (cantidad > 0) {
            numero1 = numero;
            campoNumero1.setText("");
            campoNumero2.setText("sqrt(" + numero1 + ")");
            objCalculadoraLogica = new CalculadoraLogica();
            String resultado = objCalculadoraLogica.raiz(Double.parseDouble(numero1)).toString();
            if (!resultado.equals("0.0")) {
              campoNumero1.setText(resultado);
            } else {
              campoNumero1.setText("Error"); /* Si se realiza la raíz de un número negativo, el campo de texto saca error. */
              operacion = 0;
              numero1 = "";
              numero2 = "";
              valorTotal = "";
            }
          }
        } else {
          campoNumero1.setText("");
          campoNumero2.setText("");
        }
      }
    });
    botonRaiz.setBounds(264, 60, 60, 50);
    panelBotones.add(botonRaiz);
  }

  /**
     * Método que permite saber si ya existe un punto(decimal) en el campo de texto.
     * @return Falso si no encuentra un punto y verdadero si lo encuentra.
     */

  public boolean punto() {
    boolean punto = false;
    String numero = campoNumero1.getText();
    for (int i = 0; i < numero.length(); i++) { /* Recorre cada elemento del String. */
      if (numero.charAt(i) == '.') {
        punto = true;
        break;
      }
    }
    return punto;
  }

  /**
  * Método que muestra en el label la operación que se está realizando y se restringe que no haya 
  * varios signos de operación.
  */
  
  public void botonOperacion(int ope, String s) {
    if (!campoNumero1.getText().equals("Error")) {
      String v1 = campoNumero1.getText();
      String v2 = campoNumero2.getText();
      valorTotal = "";
      if (operacion == 0) { /* Si no hay ninguna operación y el campo de texto está vacio*/
        if (v1.length() == 0) { /* añade un cero para que no se opere un null.*/
          v1 = "0";
        }
        numero1 = v1;
        if (v2.equals("")) {
          valorTotal = v1;
        } else {
          if (!algunaOperacion) {
            valorTotal += v1;
          } else {
            valorTotal += v2;
          }
        }
        campoNumero2.setText(valorTotal + " " + s + " ");
        campoNumero1.setText("");
        operacion = ope;
      }
    } else {
      campoNumero1.setText("");
      campoNumero2.setText("");
    }
  }
}
