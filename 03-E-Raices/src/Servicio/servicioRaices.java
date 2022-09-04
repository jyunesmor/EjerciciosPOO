/*
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class servicioRaices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarvariables(Raices r) {
        System.out.println(" Ingrese el valor de A");
        r.setA(leer.nextDouble());
        System.out.println(" Ingrese el valor de B");
        r.setB(leer.nextDouble());
        System.out.println(" Ingrese el valor de C");
        r.setC(leer.nextDouble());
    }

    public double getDiscriminante(Raices r) {
        double discriminante = 0;

        discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
//        (b^2)-4*a*c
        return discriminante;
    }

    public boolean tieneRaices(Raices r) {
        if (getDiscriminante(r) >= 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz(Raices r) {
        if (getDiscriminante(r) == 0) {
            return true;
        }
        return false;
    }

    public void obtenerRaices(Raices r) {

        if (tieneRaices(r) == true) {
            double raiz1 = Math.sqrt(getDiscriminante(r));
            double raiz2 = Math.sqrt(getDiscriminante(r));

            System.out.println(" ");
            System.out.println(raiz1);
            System.out.println(raiz2);
        }
    }

    public void obtenerRaiz(Raices r) {

        if (tieneRaices(r) == true) {
            double raiz1 = Math.sqrt(getDiscriminante(r));

            System.out.println(" ");
            System.out.println(raiz1);

        }
    }

    public void calcularRaices(Raices r){
        double resultado;
        double resultado1;
        
        if (tieneRaices(r) == true) {
           
            resultado = (- r.getB() + getDiscriminante(r)) / 2 * r.getA();
            
            resultado1 = (- r.getB() - getDiscriminante(r)) / 2 * r.getA();

            System.out.println(" el resultado 1 es: " + resultado);
            System.out.println(" el resultado 2 es: " + resultado1);
            
        } else if (tieneRaiz(r) == true){
            resultado = (- r.getB() + getDiscriminante(r)) / 2 * r.getA();
            System.out.println(" el resultado es: " + resultado);
        } else {
            System.out.println(" La Ecuacion no tiene Solucion");
        }
    }
}

