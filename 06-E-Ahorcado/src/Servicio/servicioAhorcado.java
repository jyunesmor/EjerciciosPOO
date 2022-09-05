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
    

    
    public void getCrearJuego(Ahorcado h){
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
    
    public void getLongitud(Ahorcado h){
    /*  • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.  */
        System.out.println("");
        System.out.println(" La Longitud de la Palabra a encontrar es de: " + h.getpBuscar().length()) ;
        System.out.println("");
        for (int i = 0; i < h.getpBuscar().length(); i++) {
            System.out.print(" x ");
        }
        h.setCantLetrasEncontradas(longPalabra);
    }
    
    public void getBuscar(Ahorcado h){
    /*  • Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. */ 
        
        System.out.println("¿ Ingrese la Letra que considera esta dentro de la palabra ?");
        h.setLetra(leer.next());
        
        int cletra = 0;
        int x = 0;
        for (int i = 0; i < longPalabra; i++) {
            if (h.getpBuscar().substring(x,x+1).equalsIgnoreCase(h.getLetra())) {
                 cletra++;             
            } 
           x++;
        }
//        if (cletra >= 1) {
//                System.out.println(" La letra esta contenida esta en la Palabra ");
//            } else {
//                System.out.println(" La letra no esta dentro de la Palabra ");
//            }
    }
     
    public boolean getEncontradas(Ahorcado h){
    /*  • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/   
        boolean flag;
        int cletra = 0;
        int x = 0;
        int nvacant = 0;
        int posl = 0;
        for (int i = 0; i < h.getpBuscar().length(); i++) {
            if (h.getpBuscar().substring(x,x+1).equalsIgnoreCase(h.getLetra())) {
                posl = i;
                cletra++;
                System.out.print(" "+h.getLetra()+" ");
            } else {
                System.out.print(" x ");
            }
          x++;
        }
        nvacant = nvacant + cletra;
        int cnatLetra = h.getpBuscar().length()-nvacant;
        h.setCantLetrasEncontradas(cnatLetra);
        System.out.println("");
        if (cletra > 1) {
            System.out.println(" La Letra " + h.getLetra().toUpperCase() + " se encuentra en la palabra secreta " + cletra + " veces.");
            System.out.println(" le restan por encontrar " + cnatLetra + " palabras.");
            return flag = true;
            
        } else if (cletra == 0){
            System.out.println(" La Letra " + h.getLetra().toUpperCase() + " no se encuentra en la palabra secreta.");
             return flag = false;
             
        } else {
           System.out.println(" La Letra " + h.getLetra().toUpperCase() + " se encuentra en la palabra secreta " + cletra + " vez.");
           System.out.println(" le restan por encontrar " + cnatLetra + " palabras.");
           return flag = true;
          
        }
      
        
    }
    
    public int getIntentos(Ahorcado h){
    /*  • Método intentos(): para mostrar cuantas oportunidades le queda al jugador. */  
  
        int intentos = h.getCintentos();
        boolean flag = getEncontradas(h);
        if (flag == false) {
            intentos--;
            System.out.println(" le quedan " + h.getCintentos() + " Intentos mas");
        } 
           h.setCintentos(intentos);
           return intentos;
     }
        
    public void getJuego(Ahorcado h){
    /* • Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main. */
    
        getCrearJuego(h);
        System.out.println("");
        getLongitud(h);
        System.out.println("");
  
        System.out.println(h.getCantLetrasEncontradas());
       do{

        getBuscar(h);
        System.out.println("");
        getEncontradas(h);
        System.out.println("");
      
      } while (h.getCintentos() > 0 || h.getCantLetrasEncontradas()> 0);
 

    }
}
