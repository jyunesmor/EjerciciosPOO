package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

public class ServicioFraccion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menuFraccion(Fraccion f) {
        boolean flag = false;

        do {
            
            System.out.println(" -------------------------- ");
            System.out.println(" Elige la Opcion a realizar ".toUpperCase());
            System.out.println(" -------------------------- ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                     System.out.println(" La suma de la Fracción ingresada es : " + sumarfracciones(f));
                    break;
                case 2:
                    System.out.println(" La Resta de la Fracción ingresada es : " + restarfracciones(f));
                    break;
                case 3:
                    System.out.println(" La Multiplicación de la Fracción ingresada es : " + multiplicarfracciones(f));
                    break;
                case 4:
                    System.out.println(" La División de la Fracción ingresada es : " + divisionfracciones(f));
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println(" La opcion elegida es Incorrecta, ingrese nuevamente");
            }
        } while (flag == false);
    }

    public void rellenarNumeros(Fraccion f) {

        System.out.println(" Ingreso numeros de Fraccion ");
        System.out.println(" --------------------------- ");
        System.out.println("");
        System.out.println(" Ingrese el valor de la Primera Fracción");
        f.setNumerador1(leer.nextInt());
        f.setDenominador1(leer.nextInt());
        System.out.println(" Ingrese el valor de la Segunda Fracción");
        f.setNumerador2(leer.nextInt());
        f.setDenominador2(leer.nextInt());

    }

    public double sumarfracciones(Fraccion f) {
        double suma = 0;

        if (f.getDenominador1() == f.getDenominador2()) {
            suma = f.getNumerador1() + f.getNumerador2();
            System.out.println( " La Fraccion resultante es: " + suma + " / " + f.getDenominador1());
            return suma /  (double) f.getDenominador1();
        } else {
            int denominadorMCM = f.getDenominador1() * f.getDenominador2();
            System.out.println( " La Fraccion resultante es: " + (f.getNumerador1() * f.getDenominador2()) + " + " + (f.getNumerador2() * f.getDenominador1() + " / " + denominadorMCM));
            int suma1 = (f.getNumerador1() * f.getDenominador2()) + (f.getNumerador2() * f.getDenominador1());
            return suma = suma1 / (double) denominadorMCM;
        }
    }   // Fin Metodo Suma

    public double restarfracciones(Fraccion f) {
        double resta = 0;

        if (f.getDenominador1() == f.getDenominador2()) {
            resta = (f.getNumerador1() - f.getNumerador2());
            System.out.println(resta + " / " + f.getDenominador1());
            return resta / (double)f.getDenominador1();
        } else {
            int denominadorMCM = f.getDenominador1() * f.getDenominador2();
            System.out.println((f.getNumerador1() * f.getDenominador2()) + " + " + (f.getNumerador2() * f.getDenominador1() + " / " + denominadorMCM));
            int resta1 = (f.getNumerador1() * f.getDenominador2()) - (f.getNumerador2() * f.getDenominador1());
            return resta = resta1 / (double)denominadorMCM;
        }
    }  // Fin Metodo Resta  

    public double multiplicarfracciones(Fraccion f) {
        double multiplicacion = 0;
        int numeradorprod = f.getNumerador1() * f.getNumerador2();
        int denominadorprod = f.getDenominador1() * f.getDenominador2();
        System.out.println(numeradorprod + " / " + denominadorprod);
        return multiplicacion = (f.getNumerador1() *  f.getNumerador2()) / (double)denominadorprod;
    }  // Fin Metodo Multiplo

    public double divisionfracciones(Fraccion f) {
        double division = 0;
        int numeradordiv = f.getNumerador1() * f.getDenominador2();
        int denominadordiv = f.getDenominador1() * f.getNumerador2();
        System.out.println(numeradordiv + " / " + denominadordiv);
        return division = (double) numeradordiv / (double) denominadordiv;
    } // Fin Metodo Div

} // Fin Clase Servicio Fraccion
