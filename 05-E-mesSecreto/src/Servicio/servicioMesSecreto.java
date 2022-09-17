/*

 */
package Servicio;

import Entidad.mesSecreto;
import java.util.Scanner;

public class servicioMesSecreto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void solicitarMes(mesSecreto ms) {

        System.out.println(" Ingrese el Mes que cree sera el resultado");
        ms.setMesSecreto(leer.nextLine());

    }
 
    public void obtenerMes(mesSecreto ms) {

    // carga Vector meses con los meses
        String [] alt = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"}; 
    // eleccion numero aleatorio del mes 
        int pos = (int) (Math.random()*11+1); 
    // Extraer mes Secreto    
//        System.out.println(pos + 1);
        String ops = "";
        for (int i = 0; i < 12; i++) {
            if (pos == i) {
                ops = alt[i];
            }
        }
          ms.setMes(ops);
          System.out.println(ops.toUpperCase());    
    }

    public void resolverAsertijo(mesSecreto ms){
       
        if (ms.getMes().equalsIgnoreCase(ms.getMesSecreto())) {
                System.out.println(" haz acertado!!!!!".toUpperCase());
                System.out.println(" El mes Ingresado por usted fue ".toUpperCase() + ms.getMes().toUpperCase()+ ", es igual al mes aleatorio : ".toUpperCase()+" - " + ms.getMes().toUpperCase()+ " - ");
        } else {
                System.out.println("lo lamento, no acerto".toUpperCase());
        }
       
    }


} // Fin ServiceClass


