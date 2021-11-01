package dominio;

import java.io.Serializable;
import java.util.*;

import javax.swing.JOptionPane;

public class Sistema extends Observable implements Serializable{

    private final ArrayList<Piloto> listaPilotos;
    private final ArrayList<Tecnico> listaTecnicos;
    private final ArrayList<Producto> listaProductos;
    private final ArrayList<Fumigacion> listaFumigaciones;
    private final int[][] matriz;
    private int min;
    private int max;

    public Sistema() {
        listaPilotos = new ArrayList<>();
        listaTecnicos = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaFumigaciones = new ArrayList<>();
        matriz = new int[16][50];
        max = 0;
        min = 0;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void cargarMatriz() {
        //vacio la matriz
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 50; j++) {
                matriz[i][j] = 0;
            }
        }
        //cargo las fumigaciones
        for (int x = 0; x < listaFumigaciones.size(); x++) {
            String[] zona = listaFumigaciones.get(x).getZona().split("-");
            int letra1 = Integer.parseInt(zona[0]);
            int numero1 = Integer.parseInt(zona[1]);
            int letra2 = Integer.parseInt(zona[2]);
            int numero2 = Integer.parseInt(zona[3]);
            for (int i = letra1 - 65; i <= letra2 - 65; i++) {
                for (int j = numero1 - 1; j <= numero2 - 1; j++) {
                    matriz[i][j] += 1;
                }
            }
        }
        // cada vez que agreago una fumigacion tambien calculo el maximo y minimo de fumigaciones
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 50; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    max = maximo;
                }
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                    min = minimo;
                }
            }
        }
        // setChanged();
        // notifyObservers();
    }

    public int[][] getMatrizFiltro(String producto, int dia) {
        int[][] matrizFiltro = new int[16][50];
        if (!producto.equals("todos") && dia != 0) {
            for (int p = 0; p < listaFumigaciones.size(); p++) {
                if (listaFumigaciones.get(p).getProducto().getNombre().equals(producto) && listaFumigaciones.get(p).getDia() == dia) {
                    String[] zona = listaFumigaciones.get(p).getZona().split("-");
                    int letra1 = Integer.parseInt(zona[0]);
                    int numero1 = Integer.parseInt(zona[1]);
                    int letra2 = Integer.parseInt(zona[2]);
                    int numero2 = Integer.parseInt(zona[3]);
                    for (int i = letra1 - 65; i <= letra2 - 65; i++) {
                        for (int j = numero1 - 1; j <= numero2 - 1; j++) {
                            matrizFiltro[i][j] += 1;
                        }
                    }
                }
            }
        }

        if (!producto.equals("todos") && dia == 0) {
            for (int p = 0; p < listaFumigaciones.size(); p++) {
                if (listaFumigaciones.get(p).getProducto().getNombre().equals(producto)) {
                    String[] zona = listaFumigaciones.get(p).getZona().split("-");
                    int letra1 = Integer.parseInt(zona[0]);
                    int numero1 = Integer.parseInt(zona[1]);
                    int letra2 = Integer.parseInt(zona[2]);
                    int numero2 = Integer.parseInt(zona[3]);
                    for (int i = letra1 - 65; i <= letra2 - 65; i++) {
                        for (int j = numero1 - 1; j <= numero2 - 1; j++) {
                            matrizFiltro[i][j] += 1;
                        }
                    }
                }
            }
        }

        if (producto.equals("todos") && dia != 0) {
            for (int p = 0; p < listaFumigaciones.size(); p++) {
                if (listaFumigaciones.get(p).getDia() == dia) {
                    String[] zona = listaFumigaciones.get(p).getZona().split("-");
                    int letra1 = Integer.parseInt(zona[0]);
                    int numero1 = Integer.parseInt(zona[1]);
                    int letra2 = Integer.parseInt(zona[2]);
                    int numero2 = Integer.parseInt(zona[3]);
                    for (int i = letra1 - 65; i <= letra2 - 65; i++) {
                        for (int j = numero1 - 1; j <= numero2 - 1; j++) {
                            matrizFiltro[i][j] += 1;
                        }
                    }
                }
            }
        }
        return matrizFiltro;
    }

    public boolean verificarZonaYAgregarFumigacion(Piloto piloto, Tecnico tecnico, Producto producto, String datos, int dia) {

        boolean pasa = false;
        boolean res = true;
        for (int i = 0; i < datos.length(); i++) {
            if (("" + datos.charAt(i)).equals("-")) {
                pasa = true;
            }
        }
        try {
            if (pasa) {
                String[] datos2 = datos.split("-");
                int sum = 0;
                int letra1 = datos2[0].hashCode();
                int numero1 = Integer.parseInt(datos2[1]);
                int letra2 = datos2[2].hashCode();
                int numero2 = Integer.parseInt(datos2[3]);
                // validamos los datos ingresados
                if (datos.length() <= 9) {
                    if (letra1 >= 65 && letra1 <= 79) {
                        sum++;
                    }
                    if (numero1 >= 1 && numero1 <= 50) {
                        sum++;
                    }
                    if (letra2 >= 65 && letra2 <= 79) {
                        sum++;
                    }
                    if (numero2 >= 1 && numero2 <= 50) {
                        sum++;
                    }
                }
                // ordeno la zona ingresada
                int let1 = letra1;
                int let2 = letra2;
                int num1 = numero1;
                int num2 = numero2;
                if (letra1 > letra2) {
                    let1 = letra2;
                    let2 = letra1;
                }
                if (numero1 > numero2) {
                    num1 = numero2;
                    num2 = numero1;
                }
                // creo la fumigacion y actualizo la matriz con fumigaciones
                if (sum == 4) {
                    Fumigacion fum = new Fumigacion();
                    fum.setPiloto(piloto);
                    fum.setTecnico(tecnico);
                    fum.setProducto(producto);
                    fum.setDia(dia);
                    fum.setZona(let1, num1, let2, num2);
                    agregarFumigacion(fum);
                    cargarMatriz();
                } else {
                    JOptionPane.showMessageDialog(null, "La zona ingresada no es correcta", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
                    res = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La zona ingresada no es correcta", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
                res = false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La zona ingresada no es correcta", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            res = false;
        }
        return res;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int color(int num) {
        int color = 0;
        if (max == min) {
            color = 255;
        } else {
            int dif = 255 / (max - min);  // el paso que da cada vez que sumo una fumigacion
            color = (max - num) * dif;   // el numero por la diferencia entre él y el maximo (el maximo corresponde a 0 en la escala de colores)
            // (el maximo corresponde a 0 en la escala de colores)
        }

        return color;
    }

    public ArrayList<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public ArrayList<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Fumigacion> getListaFumigaciones() {
        return listaFumigaciones;
    }

    public void agregarPiloto(Piloto piloto) {
        listaPilotos.add(piloto);
        setChanged();
        notifyObservers();
    }

    public void agregarTecnico(Tecnico tecnico) {
        listaTecnicos.add(tecnico);
        setChanged();
        notifyObservers();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        setChanged();
        notifyObservers();
    }

    public void agregarFumigacion(Fumigacion fumigacion) {
        listaFumigaciones.add(fumigacion);
        setChanged();
        notifyObservers();
    }

    public boolean seRepiteCedula(String cedula) {
        boolean res = false;
        for (int i = 0; i < getListaPilotos().size(); i++) {
            if (cedula.equals(getListaPilotos().get(i).getCedula())) {
                res = true;
            }
        }
        for (int j = 0; j < getListaTecnicos().size(); j++) {
            if (cedula.equals(getListaTecnicos().get(j).getCedula())) {
                res = true;
            }
        }
        return res;
    }

    public void ordenarListaPilotos() {
        Collections.sort(this.getListaPilotos());
    }

    public void ordenarListaTecnicos() {
        Collections.sort(this.getListaTecnicos());
    }

    public void ordenarListaProductos() {
        Collections.sort(this.getListaProductos());
    }

}
