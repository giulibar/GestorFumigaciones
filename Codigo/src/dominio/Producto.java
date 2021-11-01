package dominio;

import java.io.Serializable;
import java.util.*;

public class Producto extends Observable implements Comparable<Producto>, Serializable  {

    private String nombre;
    private int costo;
    private int origen;

    public Producto(String nombre, int costo, int origen) {
        this.nombre = nombre;
        this.costo = costo;
        this.origen = origen;
//        setChanged();
//        notifyObservers();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public int getOrigen() {
        return origen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        String textoOrigen = "";
        if (this.origen == 1) {
            textoOrigen = "Nacional";
        }else{
            textoOrigen = "Importado";
        }
        return "Nombre: " + this.nombre + ", costo: $" + this.costo + ", origen: " + textoOrigen;
    }

    public int compareTo(Producto producto) {
        // orden: menor a mayor del costo
        int dif = this.getCosto() - producto.getCosto();
        if (dif == 0) {
            dif = this.getOrigen() - producto.getOrigen();
        }
        return dif;
    }

}
