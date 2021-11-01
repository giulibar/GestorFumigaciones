package dominio;

import java.io.Serializable;

public class Tecnico implements Comparable<Tecnico>, Serializable {

    private String nombre;
    private String cedula;
    private String mail;

    public Tecnico(String nombre, String cedula, String mail) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", cedula: " + cedula + ", mail: " + mail;
    }

    public int compareTo(Tecnico tecnico) {
        String primero = tecnico.getNombre();
        String segundo = this.getNombre();
        return segundo.compareTo(primero);
    }

}
