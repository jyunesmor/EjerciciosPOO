/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
    • Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

import java.util.Scanner;

public class Ahorcado {

    private String[] palabra;
    private String[] paAux;
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

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void getCrearJuego() {
        /*  • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
    valor que ingresó el usuario y encontradas en 0.  */

        System.out.println(" Ingrese la Palabra a encontrar");
        String palabra1 = leer.nextLine();
        System.out.println(" Los Intentos que tendra son : " + palabra1.length());
        this.cantJugadasMaximas = palabra1.length();
        // crear e inicializar el vector palabra con las letras
        this.palabra = new String[palabra1.length()];
        this.paAux = new String[palabra1.length()];
        for (int i = 0; i < palabra1.length(); i++) {
            this.palabra[i] = palabra1.substring(i, i + 1);
            this.paAux[i] = "_";
        }
    } // Fin getCrearJuego

    public int getLongitud() {
        int longitud = this.palabra.length;
        return longitud;
    } // Fin metodo getLongitud

    public boolean getEncontradas(String letra) {
        /*  • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.*/
        boolean flag = false;
        int cletra=0;
        // buscar letra dentro de la palabra
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
               if (this.paAux[i].equals("_")){
                   this.paAux[i] = letra;
                    cletra++;
               }
                flag = true;
            }
        }
        this.cantLetrasEncontradas = this.cantLetrasEncontradas + cletra;
        if (!flag) {
            this.cantJugadasMaximas--;
        } 
        System.out.println(this.cantJugadasMaximas);
        System.out.print(" La cantidad de Letras encontradas es de " + this.cantLetrasEncontradas);
        System.out.println(" y la cantidad faltante es de " + (this.palabra.length - this.cantLetrasEncontradas) + " letras.");
        return getBuscar(letra);
    } // Fin metodo getEncontradas

    public boolean getBuscar(String letra) {
        /* • Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. */
        boolean band = false;
        int cont = 0;
        System.out.println("");
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                System.out.println("-La letra " + letra + " esta en la palabra");
                cont++;
                band = true;
            }
        }
        if (cont == 0) {
            System.out.println("-La letra " + letra + " no se encuentra en la palabra");
        }
        return band;
    } // Fin metodo getBuscar

    public void getMostrar() {
        for (int i = 0; i < this.paAux.length; i++) {
            System.out.print(" [ " + this.paAux[i] + " ]");
        }
        System.out.println("");
        System.out.println("");
    } // Fin metodo getMostrar

    public void getJuego() {
        getCrearJuego();
        String le;
                
        do {
            getMostrar();
            System.out.println("¿ Ingrese la Letra que considera esta dentro de la palabra ?");
            le = leer.next();
            getEncontradas(le);
    
        } while (this.cantJugadasMaximas != 0 && this.cantLetrasEncontradas != this.palabra.length);

    } // Fin metodo getJuego

} // Fin Ahoracado Class
