/*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
        ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
        una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
        frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // Variable
    String nvaFrase ;
    String letra1 ;
    String unirFras;

    // Metodos
    
    /* a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
        ingresada.*/
    public void vocales(Cadena c) {
        int cVocal = 0;
        String [] frase = new String [c.getLongitud()];
        int x = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            // toma vocal 
            frase[x] = c.getFrase().substring(x,x+1);
            
            if ( frase[x].equalsIgnoreCase("a") ||  frase[x].equalsIgnoreCase("e") || 
                    frase[x].equalsIgnoreCase("i") ||  frase[x].equalsIgnoreCase("o") ||  frase[x].equalsIgnoreCase("u")) {
                cVocal++; 
            }
            x ++;
        }
        if (cVocal == 1) {
            System.out.println(" La cantidad de Vocales en la Frase ingresada es de : " + cVocal + " Vocal.");
        } else if (cVocal > 1) {
            System.out.println(" La cantidad de Vocales en la Frase ingresada es de : " + cVocal + " Vocales.");
           } else {
           System.out.println(" La Cadena Ingresada no posee ninguna Vocal.");
        }
    }                 
 
    /* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". */

    public void invertirFrase(Cadena c){
        String[] vector = new String[c.getLongitud()];
       
        int j = c.getLongitud();
        for (int i = 0; i < c.getLongitud(); i++) {
            vector[i] = c.getFrase().substring(j-1, j);
            j = j-1;
        }
        System.out.print("La frase invertida es: ");
        for (int i = 0; i < c.getLongitud(); i++) {
            System.out.print(" " +  vector[i].toUpperCase() );
        }
        System.out.println(" ");
    }

    /* c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
    public void vecesRepetido(Cadena c) {
        System.out.println(" ");
        System.out.println(" Ingrese el caracter a contar dentro de la Frase ingresada");
        String letra = leer.nextLine();
        int contLetra = 0;
        String [] frase = new String [c.getLongitud()];
  
        for (int i = 0; i < c.getLongitud(); i++) {
            frase[i] = c.getFrase().substring(i,i+1);
            if ( frase[i].equalsIgnoreCase(letra)) {
                contLetra++; 
            }
        }
        System.out.println(" La Cantidad de Veces que se repite el Carater " + letra.toUpperCase() + " es de " + contLetra + " veces.-");
    }

    /* e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario. */
    public void compararLongitud(Cadena c) {
        System.out.println(" ");
        System.out.println(" Ingrese la nueva Frase a Comprar su longitud con la ingresada primeramente");
        nvaFrase = leer.nextLine();
       
        if (nvaFrase.length() == c.getLongitud()) {
            System.out.println(" La Longitud de ambas frases son iguales");
        } else if ( nvaFrase.length() > c.getLongitud()) {
            System.out.println(" La Longitud de la frase " + nvaFrase.toUpperCase() + ", es Mayor que el de " + c.getFrase().toUpperCase() + " .-");
        } else {
            System.out.println(" La Longitud de la frase " + c.getFrase().toUpperCase() + ", es Mayor que el de " + nvaFrase.toUpperCase() + " .-");
        }
    }  

    /* f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
        una nueva frase ingresada por el usuario y mostrar la frase resultante.  */
    public void unirFrase(Cadena c) {
        System.out.println(" ");
        System.out.println(" La nueva Frase, que resulta de unir ambas frases ingresadas es de : ");
        unirFras = c.getFrase().concat(", " + nvaFrase); 
        System.out.println(unirFras);
    }   
    /////FALTA TERMINAR
    /* g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
        frase resultante. */
    public void reemplazarLetra(Cadena c) {
        System.out.println(" ");
        System.out.println(" Ingrese la letra a reemplazar en la Frase: ");
        letra1 = leer.nextLine();
        String [] frase = new String [c.getLongitud()];
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            frase[i] = c.getFrase().substring(i,i+1);
            if ( frase[i].equalsIgnoreCase(letra1)) {
                frase[i] = "&";
            }   
            cont++;
        }
        System.out.println(cont);
        System.out.println(" La Nueva Frase con el Reemplazo es: ");
        for (int i = 0; i < c.getLongitud(); i++) {
            System.out.print(frase[i]);
        }
    }   
    
    /* h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no.  */
    public boolean contieneLetra(Cadena c) {
        boolean contiene =false;
        System.out.println(" ");
        System.out.println(" Ingrese la letra esta contenida en la Frase ingresada: ");
        letra1 = leer.nextLine();
     
        String [] frase = new String [c.getLongitud()];
        
        for (int i = 0; i < unirFras.length(); i++) {
            frase[i] = unirFras.substring(i,i+1);
            if ( frase[i].equalsIgnoreCase(letra1)) {
                return contiene = true;
            }      
        }
           return contiene;
    } 
}
