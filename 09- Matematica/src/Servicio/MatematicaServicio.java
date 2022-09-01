/*
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
        al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidad.Matematica;

public class MatematicaServicio {

    // a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica m) {

        System.out.println(" ------------------------ ");
        System.out.println(" Mayor entre Número 1 y 2 ");
        System.out.println(" ------------------------ ");
        if (m.getNum1() > m.getNum2()) {
            System.out.println(" El número 1: " + String.format("%.2f", m.getNum1()) + " es Mayor que el número 2 " + String.format("%.2f", m.getNum2()));
        } else if (m.getNum1() < m.getNum2()) {
            System.out.println(" El número 2: " + String.format("%.2f", m.getNum2()) + " es Mayor que el número 1 " + String.format("%.2f", m.getNum1()));
        } else {
            System.out.println(" Ambos Números son iguales");
        }

    }

    /* b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
      al menor número. Previamente se deben redondear ambos valores. */
    public void calcularPotencia(Matematica m) {

        System.out.println(" ---------------------------------- ");
        System.out.println(" El Valor elevado a la Potencia es: ");
        System.out.println(" ---------------------------------- ");
        if (m.getNum1() > m.getNum2()) {
            System.out.println(" El número " + String.format("%.0f", m.getNum1())
                    + " elevado al número " + String.format("%.0f", m.getNum2()) + " es de: " + String.format("%.0f", Math.pow(Math.round(m.getNum1()), Math.round(m.getNum2()))));
        } else {
            System.out.println(" El número " + String.format("%.0f", m.getNum2())
                    + " elevado al número " + String.format("%.0f", m.getNum1()) + " es de: " + String.format("%.0f", Math.pow(Math.round(m.getNum2()), Math.round(m.getNum1()))));
        }
    }

    /*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
     Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
    public void calcularRaiz(Matematica m) {

        System.out.println(" ------------------------ ");
        System.out.println(" La Raiz Cuadrada es de : ");
        System.out.println(" ------------------------ ");
        if (m.getNum2() > m.getNum1()) {
            System.out.println(" La Valor Absoluto del número 1 es : " + String.format("%.2f", Math.abs(m.getNum1())) + " y su raiz Cuadrada es: " + String.format("%.2f", Math.sqrt(Math.abs(m.getNum1()))));
        } else {
            System.out.println(" La Valor Absoluto del número 2 es : " + String.format("%.2f", Math.abs(m.getNum2())) + " y su raiz Cuadrada es: " + String.format("%.2f", Math.sqrt(Math.abs(m.getNum2()))));
        }
    }                                                                                                                                                                                                       
                                        
} // Fin Clase MatematicaServicio
