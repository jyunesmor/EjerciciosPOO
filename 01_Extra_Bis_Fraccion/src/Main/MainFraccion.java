/*

 */
package Main;

import Entidad.Fraccion;
import Servicio.ServicioFraccion;

public class MainFraccion {

    
    public static void main(String[] args) {
        
        Fraccion f = new Fraccion();
        ServicioFraccion sf = new ServicioFraccion();
        
        
        sf.rellenarNumeros(f);
        sf.menuFraccion(f);
        
    }
    
}
