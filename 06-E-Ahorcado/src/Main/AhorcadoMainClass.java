/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
    • Constructores, tanto el vacío como el parametrizado.
 */
package Main;

import Entidad.Ahorcado;
import Servicio.servicioAhorcado;

public class AhorcadoMainClass {

    public static void main(String[] args) {

        Ahorcado a = new Ahorcado();
        servicioAhorcado sa = new servicioAhorcado();

//        sa.getCrearJuego(a);
//        System.out.println("");
//        sa.getLongitud(a);
//        System.out.println("");
//        sa.getBuscar(a);
//        System.out.println("");
//        sa.getEncontradas(a);
//        System.out.println(a.getCintentos());
          sa.getJuego(a);
 
    }

}
