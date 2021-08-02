package model;

public class User {
    private String nombre;
    private int estado;

    public int getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
