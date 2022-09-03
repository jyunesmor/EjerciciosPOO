/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
    • Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

public class Ahorcado {
    
    private String pBuscar;
    private char cnotLetra;
    private int cintentos;

    public Ahorcado() {
    }

    public Ahorcado(String pBuscar, char cnotLetra, int cintentos) {
        this.pBuscar = pBuscar;
        this.cnotLetra = cnotLetra;
        this.cintentos = cintentos;
    }

    public String getpBuscar() {
        return pBuscar;
    }

    public void setpBuscar(String pBuscar) {
        this.pBuscar = pBuscar;
    }

    public char getCnotLetra() {
        return cnotLetra;
    }

    public void setCnotLetra(char cnotLetra) {
        this.cnotLetra = cnotLetra;
    }

    public int getCintentos() {
        return cintentos;
    }

    public void setCintentos(int cintentos) {
        this.cintentos = cintentos;
    }
    
    
}
