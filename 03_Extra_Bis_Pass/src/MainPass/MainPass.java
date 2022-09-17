/*

 */
package MainPass;

import Entidad.Pass;
import ServicioPass.ServicioPass;
import java.util.Scanner;

public class MainPass {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        /* ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
        teclado)*/
        Pass p = new Pass("Juan",30330831);
        ServicioPass s = new ServicioPass();
 
        s.menuPass(p);
        System.out.println(p.toString());
    }
    
}
