/*
 
 */
package entidad;

public class date {
    
    private int [] dia = new int [1]; 
    private int [] mes = new int [1];
    private int [] anio = new int [1];

    public date() {
    }

    public date(int dia [], int mes [], int anio []){
        this.dia= dia;
        this.mes = mes;
        this.anio = anio;
    }

    public date(int dia, int mes, int anio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int[] getDia() {
        return dia;
    }

    public void setDia(int[] dia) {
        this.dia = dia;
    }

    public int[] getMes() {
        return mes;
    }

    public void setMes(int[] mes) {
        this.mes = mes;
    }

    public int[] getAnio() {
        return anio;
    }

    public void setAnio(int[] anio) {
        this.anio = anio;
    }


    
    
    
    
}
