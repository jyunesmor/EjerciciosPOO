/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde.
• Métodos getters y setters para el número de DNI y la letra.
*/
package Entidad;

public class NIF {
    
    private int DNI;
    private char  letra;
    private String nombre;

    public NIF() {
    }

    public NIF(int DNI, char letra, String nombre) {
        this.DNI = DNI;
        this.letra = letra;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}
