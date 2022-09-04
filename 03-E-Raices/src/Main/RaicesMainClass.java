
package Main;

import Entidad.Raices;
import Servicio.servicioRaices;

public class RaicesMainClass {

    public static void main(String[] args) {
        
        Raices r = new Raices();
        servicioRaices sr = new servicioRaices();
  
        sr.cargarvariables(r);
        sr.calcularRaices(r);
        sr.obtenerRaices(r);
        sr.obtenerRaiz(r);
        double c = sr.getDiscriminante(r);
        System.out.println(c);
    }
}
