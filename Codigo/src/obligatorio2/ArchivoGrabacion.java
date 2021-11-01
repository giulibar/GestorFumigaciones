
package obligatorio2;

import java.util.*;
import java.io.*;

public class ArchivoGrabacion {
  private Formatter out;
    
    public ArchivoGrabacion(String unNombre){
        try {
            out = new Formatter(unNombre);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }

    public ArchivoGrabacion(String unNombre, boolean extender){
        try {
            // Este cosntructor de FileWriter si el 2do parámetro es true
            // y el archivo existe, no lo borra sino que lo deja pronto
            // para agregarle información
            FileWriter arch = new FileWriter(unNombre, extender);
            out = new Formatter(arch);
        }
        catch(IOException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String linea){
        out.format("%s%n", linea);
    }
    
    public void cerrar(){
        out.close();
    }
}
