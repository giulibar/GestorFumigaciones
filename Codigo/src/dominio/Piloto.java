package dominio;

import java.io.Serializable;
import java.util.*;

public class Piloto extends Observable implements Comparable<Piloto>, Serializable {

    private String nombre;
    private String cedula;
    private String direccion;
    private int añosExperiencia;

    public Piloto(String nombre, String cedula, String direccion, int añosExperiencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", a\u00f1os de experiencia: " + this.añosExperiencia + ", cedula: " + this.cedula + ", direccion: " + this.direccion;
    }

    public int compareTo(Piloto piloto) { // de mayor a menor
        return piloto.getAñosExperiencia() - this.getAñosExperiencia();
    }

}
