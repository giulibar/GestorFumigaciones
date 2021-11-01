package dominio;

import java.io.Serializable;

public class Fumigacion implements Serializable {

    private Piloto piloto;
    private Tecnico tecnico;
    private Producto producto;
    private String zona;
    private int dia;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setZona(int letra1, int numero1, int letra2, int numero2) {
        this.zona = letra1+"-"+numero1+"-"+letra2+"-"+numero2;
    }

    public String getZona() {
        return zona;
    }

}
