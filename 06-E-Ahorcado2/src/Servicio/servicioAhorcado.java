
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class servicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int cantletra = 0;
    
    public void getCrearJuego(Ahorcado h) {
        /*  • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.  */
        String palabra;
        System.out.println(" Ingrese la Palabra a Utilizar");
        palabra = leer.nextLine();
        h.setCantJugadasMaximas(palabra.length());
        System.out.println(" La cantidad de Intentos son: " + h.getCantJugadasMaximas());
        // Creamos y cargamos Vector palabra
        h.setPalabra(new String [palabra.length()]);
        h.setPaAux(new String [palabra.length()]);
        for (int i = 0; i < palabra.length(); i++) {
            h.getPalabra()[i] = palabra.substring(i, i + 1);
            h.getPaAux()[i] = "_";   
        }
    } // Fin getCrearJuego

    public int getLongitud(Ahorcado h) {
        /*  • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length. */
        System.out.println("");
        System.out.println(" La Longitud de la Palabra a encontrar es de: " + h.getPalabra().length);
        System.out.println("");
        int longitud = h.getPalabra().length;
        return longitud;
    }

    public boolean getEncontradas(Ahorcado h) {
        /*  • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/
        boolean flag = false;
        int cletra = 0;
        // buscar letra dentro de la palabra
        for (int i = 0; i < h.getPalabra().length; i++) {
            if (h.getPalabra()[i].equalsIgnoreCase(h.getLetra())) {
                if (h.getPaAux()[i].equals("_")) {
                    h.getPaAux()[i] = h.getLetra().toUpperCase();
                    cletra++;
                }
                   flag = true;
            } 
        }
        cantletra = h.getCantLetrasEncontradas() + cletra;
        h.setCantLetrasEncontradas(cantletra);
        int intentos = h.getCantJugadasMaximas();
        if (!flag) {
            intentos--;
        }
        h.setCantJugadasMaximas(intentos);
       
        return getBuscar(h);
    } // Fin metodo getEncontradas

    public boolean getBuscar(Ahorcado h) {
        /*  • Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. */
 
        boolean flag = false;
        int cletra = 0;
        for (int i = 0; i < h.getPalabra().length; i++) {
            if (h.getPalabra()[i].equalsIgnoreCase(h.getLetra())) {
                cletra++;
            }
        }
        if (cletra >= 1) {
            System.out.println(" La letra esta contenida esta en la Palabra ");
            System.out.println(" La cantidad de Letras encontradas es de " + h.getCantLetrasEncontradas());
            System.out.println(" y la cantidad faltante es de " + (h.getPalabra().length - h.getCantLetrasEncontradas()) + " letras.");
            System.out.println(" Los Intentos restantes son: " + h.getCantJugadasMaximas());
            System.out.println("");
            flag = true;
        } else {
            System.out.println(" La letra no esta dentro de la Palabra ");
            System.out.println(" Los Intentos restantes son: " + h.getCantJugadasMaximas());
        }
        return flag;
        
    } // Fin metodo getBuscar
     
    public void getMostrar (Ahorcado h){
        for (int i = 0; i < h.getPaAux().length; i++) {
           System.out.print("[ " + h.getPaAux()[i] + " ]");
        }
         System.out.println("");
         System.out.println("");
    } // Fin metodo getMostrar
        
    public void getJuego(Ahorcado h){
            /* • Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main. */
            
            
            System.out.println(" ----------------- ");
            System.out.println("    EL AHORCADO    ");
            System.out.println(" ----------------- ");
            System.out.println("");  
            getCrearJuego(h);
            String le; 
            System.out.println("");   
        do {
            System.out.println("");  
            getMostrar(h);
            System.out.println("¿ Ingrese la Letra que considera esta dentro de la palabra ?");
            le = leer.next();
            h.setLetra(le);
            getEncontradas(h);   
           
        } while (h.getCantJugadasMaximas() != 0 && h.getCantLetrasEncontradas() != h.getPalabra().length);
        System.out.println("");
        
        if (h.getCantJugadasMaximas() == 0) {
            System.out.println(" Perdiste, Superaste la Cantidad de Opotunidades!!!!!!!!! ".toUpperCase());  
        }
        if ( h.getCantLetrasEncontradas() == h.getPalabra().length) {
            getMostrar(h);
            System.out.println(" Ganaste, encontraste la palabra escondida!!!!!!!!! ".toUpperCase());
        }
    } // Fin metodo getJuego

} // Fin servicioAhorcado Class
