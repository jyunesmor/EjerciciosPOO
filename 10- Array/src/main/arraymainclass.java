/*

 */
package main;

import entidad.array;
import servicio.arrayservicio;


public class arraymainclass {

    public static void main(String[] args) {
     
        arrayservicio as = new arrayservicio();
        array a = new array();
        
        as.llenarArray(a);
        System.out.println("------------");
        as.ordenarArray(a);
        System.out.println("------------");
        as.complatarArrayB(a);
    
    }
    
}
