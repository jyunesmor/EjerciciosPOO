/*

 */
package servicio;


import entidad.array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class arrayservicio {
    
          double [] vecA = new double [4];
          double [] vecB = new double [4];
          double [] vector1 = new double [4];
          double [] vector2 = new double [4];
          DecimalFormat df = new DecimalFormat("#.00");
    
    public void llenarArray(array a){
        
        for (int i = 0; i < 4; i++) {
//            Arrays.fill(vecA,i,i+1,Math.random()*10+1);
//            a.setArregloA(vecA);
             vector1[i]=((int)(Math.random() * 10));
             a.setArregloA(vector1);
        }
        System.out.println(Arrays.toString(a.getArregloA()));
    }

    public void ordenarArray(array a){
     
     
            Arrays.sort(vector1);
            a.setArregloA(vector1);
        System.out.println(Arrays.toString(a.getArregloA()));
        
    }    
    
    public void complatarArrayB(array a){
//      int lonA = a.getArregloB().length/2;
         
        for (int i = 2; i < 4; i++) {
//             vector2[] = Arrays.copyOf(vector1,2);
        }
        vector2 = Arrays.copyOf(vector1,2); 
            
        for (int i = 2; i < 4; i++) {
            vector2[i]= 0.5;
            a.setArregloB(vector2);
           System.out.println(Arrays.toString(a.getArregloB()));
        }
    
    }    
}
