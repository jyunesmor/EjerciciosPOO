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

    
    public void getCrearJuego(Ahorcado h){
    /*  • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.  */
        String palabra ;
        System.out.println(" Ingrese la Palabra a Utilizar");
        palabra = leer.nextLine();
        System.out.println(" Ingrese los Intentos Maximos a realizar");
        h.setCantJugadasMaximas(leer.nextInt());
        // Creamos y cargamos Vector palabra
        String [] vector = new String [palabra.length()];
        String [] vector1 = new String [palabra.length()];
     
        int x = 0;
             for (int i = 0; i < palabra.length(); i++) {
                 vector[i] = palabra.substring(i,i+1);
                 vector1[i] = "_";
                  x++;
              }
             h.setPalabra(vector);
             h.setPaAux(vector1);
        
         // Mostramos Vector palabra
        System.out.println("-----------------------");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(" " + h.getPalabra()[i] + " caracter " + i);
        }
        System.out.println("-----------------------");
        
    }
    
    public int getLongitud(Ahorcado h){
    /*  • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.  */
        System.out.println("");
        System.out.println(" La Longitud de la Palabra a encontrar es de: " + h.getPalabra().length );
        System.out.println("");
         int longitud = h.getPalabra().length;
         return longitud;
    }
    
    public void getBuscar(Ahorcado h){
    /*  • Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. */ 
        
        System.out.println("¿ Ingrese la Letra que considera esta dentro de la palabra ?");
        String le = leer.next();
        h.setLetra(le);
        int cletra = 0;
        int x = 0;
        for (int i = 0; i < h.getPalabra().length; i++) {
            if ( h.getPalabra()[i].equals(le)) {
                 cletra++;             
            } 
           x++;
        }
        if (cletra >= 1) {
                System.out.println(" La letra esta contenida esta en la Palabra\n " + le.toUpperCase());
            } else {
                System.out.println(" La letra no esta dentro de la Palabra\n " + le.toUpperCase());
            }
    }
     
    public boolean getEncontradas(Ahorcado h){
    /*  • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/   
        String [] vec = new String [h.getPalabra().length];
        boolean flag;
        int cletra = 0;
        int cantletra = 0;
        
        for (int i = 0; i < h.getPalabra().length; i++) {
            if ( h.getPalabra()[i].equals(h.getLetra())) {
                if (h.getPaAux()[i].equals("_")){
                    vec[i]= h.getLetra();
                      cletra++;
                }
            } else {
                vec[i]= "_";
            }
        }
        cantletra = h.getCantLetrasEncontradas() + cletra;
        h.setCantLetrasEncontradas(cantletra);
        h.setPaAux(vec);
        for (int i = 0; i < h.getPalabra().length; i++) {
             System.out.print( " "+h.getPaAux()[i].toUpperCase()+" ");
        }
        System.out.println("");
        if (cletra > 1) {
            System.out.print(" La Letra " + h.getLetra() + " se encuentra en la palabra secreta " + cletra + " veces.");
            System.out.print(" le restan por encontrar " + (getLongitud(h) - h.getCantLetrasEncontradas())+ " letras.");
            return flag = true;
            
        } else if ( cletra == 0){
            System.out.print(" La Letra no se encuentra en la palabra secreta.");
             return flag = false;
        } else {
           System.out.print(" La Letra " + h.getLetra() + " se encuentra en la palabra secreta " + cletra + " vez.");
           System.out.print(" le restan por encontrar " + (getLongitud(h) - h.getCantLetrasEncontradas())+ " letra.");
           return flag = false;
        }
    }
    
    public int getIntentos(Ahorcado h){
    /*  • Método intentos(): para mostrar cuantas oportunidades le queda al jugador. */  
  
        int intento = h.getCantJugadasMaximas();
        boolean flag = getEncontradas(h);
        if (flag == false) {
           intento--;
        } 
      
             return intento;
     }
        
    public void getJuego(Ahorcado h){
    /* • Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main. */
    
    
    
        int bandera = 3;
        getCrearJuego(h);
        System.out.println("");
        
        
      do{
          
          getBuscar(h);
          System.out.println("");
          getEncontradas(h);
          System.out.println("");
          System.out.println(" intentos " + getIntentos(h));
          if ((h.getCantLetrasEncontradas() == getLongitud(h) || getIntentos(h) == 0)) {
              bandera = 4;
          } 

      } while(bandera != 4);
        
//h.getCantLetrasEncontradas() < getLongitud(h) ||

    }
}
