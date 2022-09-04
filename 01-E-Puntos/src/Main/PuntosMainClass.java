/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Puntos;
import Servicio.servicioPuntos;

public class PuntosMainClass {
 
    public static void main(String[] args) {
    
        Puntos p = new Puntos();
        servicioPuntos sp = new servicioPuntos();
        
        sp.crearPuntos(p);
        System.out.println("");
        sp.distanciaPuntos(p);
        
        
    }
    
}
