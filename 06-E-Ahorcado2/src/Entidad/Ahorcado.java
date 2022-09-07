/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
    • Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

public class Ahorcado {
    
    private String [] palabra;
    private String [] paAux;
    private int cantLetrasEncontradas = 0;
    private int cantJugadasMaximas = 0;
    private String letra;



    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] paAux, String letra, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.paAux = paAux;
        this.letra = letra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPaAux() {
        return paAux;
    }

    public void setPaAux(String[] paAux) {
        this.paAux = paAux;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    
    
}
