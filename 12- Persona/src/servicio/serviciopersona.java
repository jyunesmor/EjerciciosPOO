/*
 • Agregar un método de creación del objeto que respete la siguiente firma:
      crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
      usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
      fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
      en cuenta que para conocer la edad de la persona también se debe conocer la fecha
      actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
      edad y retorna true en caso de que el receptor tenga menor edad que la persona que
      se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
      anterior.
 */
package servicio;

import entidad.persona;
import java.util.Date;
import java.util.Scanner;

public class serviciopersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    int edad = 0;
    /*• Agregar un método de creación del objeto que respete la siguiente firma:
      crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
      usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
      fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
 
    public void crearPersona(persona p){
        
        System.out.println(" Ingrese Nombre");
        p.setNombre(leer.nextLine());
        
        System.out.println(" Ingrese Fecha de Nacimiento ");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        
        Date  fechadenacimiento = new Date(anio-1900,mes-1,dia);
        p.setFechadenacimiento(fechadenacimiento);
  
    }
    
    
    public void calcularEdad(persona p){
       
        Date fechActual = new Date();
        
        edad = fechActual.getYear()- p.getFechadenacimiento().getYear();
      
        
        if (p.getFechadenacimiento().getMonth() <= fechActual.getMonth() 
                && p.getFechadenacimiento().getDay() < fechActual.getDay()
                || p.getFechadenacimiento().getMonth() > fechActual.getMonth()) {
            edad--;
        }
        
        System.out.println(edad); 
         
        } 
    
    public boolean menorQue(persona p){
        System.out.println(" Ingrese la edad a comparar");
        int edad2 = leer.nextInt();
        if (edad2 < edad) {
            return false;
        } 
            return true;
    }
    
    public void mostrarPersona(persona p){
        
        System.out.println(p.toString()); 
    }
            
    
}
