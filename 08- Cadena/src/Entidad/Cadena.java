
package Entidad;

import java.util.Scanner;

public class Cadena {
  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // Atributos 
    private String frase; 
    private int longitud; 
    
    // Contructor, Getter y Setter

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
}
