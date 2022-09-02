
package Main;

import Entidad.NIF;
import Servicio.servicioNIF;

public class NIFMainClass {

    public static void main(String[] args) {
        
        NIF n = new NIF();
        servicioNIF sn = new servicioNIF();
        
        
        sn.llenadoDatos(n);
        System.out.println("");
        sn.crearNif(n);
        System.out.println("");
        sn.mostrarNif(n); 
        System.out.println("");
    }
    
}
