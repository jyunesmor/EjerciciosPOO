package main;

import entidad.persona;
import servicio.serviciopersona;


public class personamainclass {

    public static void main(String[] args) {
        
        serviciopersona ps = new serviciopersona ();
        persona p = new persona();
        
        ps.crearPersona(p);
        ps.calcularEdad(p);
        boolean flag = ps.menorQue(p);
        
        if (flag == false) {
            System.out.println(" ¿ La primera edad ingresada es menor a la Segunda ? " + flag);
        } else {
            System.out.println(" ¿ La primera edad ingresada es mayor a la Segunda ? " + flag);
        }
        
        ps.mostrarPersona(p);
     
        
        
    }
    
}
