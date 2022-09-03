/*
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class servicioAhorcado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");   
    // Variables a Utilizar en metrodos
    int longPalabra = 0;
    
    
    public void crearJuego(Ahorcado h){
    /*  • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.  */
        
        System.out.println(" Ingrese la Palabra a Utilizar");
        h.setpBuscar(leer.nextLine());
        System.out.println(" Ingrese los Intentos Maximos a realizar");
        h.setCintentos(leer.nextInt());
        // Obtenemos Longitud Palabra
        longPalabra = h.getpBuscar().length();
        // Creamos y cargamos Vector palabra
        String [] palabra = new String [longPalabra];
        int x = 0;
        for (int i = 0; i < longPalabra; i++) {
           palabra[i] = h.getpBuscar().substring(x,x+1);
           x++;
        }
         // Mostramos Vector palabra
        for (int i = 0; i < longPalabra; i++) {
            System.out.println(palabra[i] + " caracter " + i);
        }

    }
    
    public void longitud(Ahorcado h){
    /*  • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.  */
        System.out.println("");
        System.out.println(" La Longitud de la Palabra a encontrar es de: " + h.getpBuscar().length()) ;
        System.out.println("");
    }
    
    public void buscar(Ahorcado h){
    /*  • Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. */ 
        
        
    
    
    }
     
    public void encontradas(Ahorcado h){
    /*  • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/   
        
    }
    
    public void intentos(Ahorcado h){
    /*  • Método intentos(): para mostrar cuantas oportunidades le queda al jugador. */  
        
    }
        
    public void juego(Ahorcado h){
    /* • Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main. */
        
    }
}
