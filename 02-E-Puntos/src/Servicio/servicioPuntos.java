/*
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class servicioPuntos {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPuntos(Puntos p){
      
        System.out.println(" Ingrese la Posicion X del Punto 1");
        p.setX1(leer.nextInt());
        System.out.println(" Ingrese la Posicion Y del Punto 1");
        p.setY1(leer.nextInt());
        System.out.println(" Ingrese la Posicion X del Punto 2");
        p.setX2(leer.nextInt());
        System.out.println(" Ingrese la Posicion Y del Punto 2");
        p.setY2(leer.nextInt());
    }
      
    public void distanciaPuntos(Puntos p){
        
        double potenciaP1 = Math.pow((p.getX1()- p.getX2()), 2);
        System.out.println(potenciaP1);
        double potenciaP2 = Math.pow((p.getY1()- p.getY2()), 2);
        System.out.println(potenciaP2);
        
        double d = Math.sqrt((potenciaP1 + potenciaP2));
        double h = 2 * Math.sqrt(13);
        System.out.println(h);
        System.out.println(" La Distancia entre los Puntos P1 y P2 es de: " + d);
                
        
    }
    
    
}
