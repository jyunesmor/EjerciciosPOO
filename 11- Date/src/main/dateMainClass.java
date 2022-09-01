/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual
 */
package main;

import entidad.date;
import java.util.Date;
import java.util.Scanner;
import serviciodate.serviciodate;

public class dateMainClass {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el su mes nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el su año de Nacimiento");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900,mes - 1,dia);
        Date FechActual = new Date();
        
        System.out.print("");
        System.out.println(" La fecha Actual es " + FechActual);
        System.out.print("");
        System.out.println(" La fecha Actual es " + fecha);
        
        int dif = FechActual.getYear()- fecha.getYear();
        
        System.out.println(" La diferencia de años es " + dif);
        
    }
    
}
