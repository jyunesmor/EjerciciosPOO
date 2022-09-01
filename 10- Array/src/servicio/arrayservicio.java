/*

 */
package servicio;

import entidad.array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class arrayservicio {
        DecimalFormat df = new DecimalFormat("#.00");
        double[] vector1 = new double[50];
        double[] vector2 = new double[20];
        

    public void llenarArray(array a) {
        
        for (int i = 0; i < a.getArregloA().length; i++) {

            vector1[i] =  Math.random() * 100 + 1;
            
            a.setArregloA(vector1);
        }
        System.out.print(Arrays.toString(a.getArregloA()));
    }

    public void ordenarArray(array a) {

        Arrays.sort(vector1);
        a.setArregloA(vector1);
        System.out.println(Arrays.toString(a.getArregloA()));

    }

    public void complatarArrayB(array a) {
        int lonA = a.getArregloB().length / 2;
       
        System.arraycopy(vector1, 0, vector2, 0, lonA);
        for (int i = lonA; i < a.getArregloB().length; i++) {
            vector2[i] = 0.5;
        }
        for (int i = 0; i < a.getArregloB().length; i++) {
            System.out.print("- " + vector2[i] + " -");
        }
        System.out.println("");
    }
}
