/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 */
package Main;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;


public class CadenaMainClass {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");   
      
        // Creacion de Objeto Frase
        CadenaServicio cd = new CadenaServicio();
        Cadena cad = new Cadena();
        
        // Pedido de Frase
        System.out.println(" Ingrese una frase");
        cad.setFrase(leer.nextLine());
        // Obtención longitud
        cad.setLongitud(cad.getFrase().length());
        
        cd.vocales(cad);
        System.out.println(" ");
        cd.invertirFrase(cad);
        System.out.println(" ");
        cd.vecesRepetido(cad);
        System.out.println(" ");
        cd.compararLongitud(cad);
        System.out.println(" ");
        cd.unirFrase(cad);
        System.out.println(" ");
        cd.reemplazarLetra(cad);
        System.out.println(" ");
        if (cd.contieneLetra(cad)== true) {
            System.out.println(" La letra ingreasada esta dentro de la Frase.-");
        } else {
            System.out.println(" La letra ingreasada no esta dentro de la Frase.-");
        }
        System.out.println(" ");
      
//        //     System.out.println(cad.toString());
    }
    
}
