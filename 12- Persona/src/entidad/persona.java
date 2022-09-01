package entidad;

import java.util.Date;

public class persona {
    
    private String nombre;
    private Date fechadenacimiento;

    public persona() {
    }

    public persona(String nombre, Date fechadenacimiento) {
        this.nombre = nombre;
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", fechadenacimiento=" + fechadenacimiento + '}';
    }
   
    
    
    
    
    
    
}
