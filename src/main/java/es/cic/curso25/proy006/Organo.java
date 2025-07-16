package es.cic.curso25.proy006;

public class Organo {
    private String nombre;
    private String funcion;
    private String estado;
    
    public Organo() {
    }

    public Organo(String nombre, String funcion, String estado) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
   
}
