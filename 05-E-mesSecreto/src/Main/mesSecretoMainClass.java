
package Main;

import Entidad.mesSecreto;
import Servicio.servicioMesSecreto;

public class mesSecretoMainClass {

    public static void main(String[] args) {
       
        mesSecreto m = new mesSecreto();
        servicioMesSecreto ms = new servicioMesSecreto();
        
//        ms.solicitarMes(m);
        System.out.println("-------------");
        ms.obtenerMes(m);
        System.out.println("-------------");
      ms.solicitarMes(m);
        ms.resolverAsertijo(m);
        System.out.println("");
    }
    
}
