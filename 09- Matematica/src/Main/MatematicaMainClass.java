/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set.
 */
package Main;

import Entidad.Matematica;
import Servicio.MatematicaServicio;
import java.util.Scanner;

public class MatematicaMainClass {

    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");  
        //  Llamado del Servicio 
        MatematicaServicio ms = new MatematicaServicio();
        //  Creacion Objeto
        Matematica m = new Matematica();
        
        // Obtención Valor de num1
        m.setNum1(Math.random()*10+1);
        // Obtención Valor de num2
        m.setNum2(Math.random()*10+1);
        
        System.out.println("");
        ms.devolverMayor(m);
        System.out.println("");
        ms.calcularPotencia(m);
        System.out.println("");
        ms.calcularRaiz(m);
        System.out.println("");   
        
        System.out.println(m.toString());
    } // Fin del Main
    
} // Fin de la Clase
