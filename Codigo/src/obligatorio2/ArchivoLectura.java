package obligatorio2;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String unNombre){
        try {
            in = new Scanner(Paths.get(unNombre));
        }
        catch(IOException e){
            System.out.println("No se puede abrir el archivo");
            System.exit(1);
        }
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }
    
    // El método linea() devuelve la última linea leida por hayMasLineas()
    public String linea(){
        return linea;
    }
    
    public void cerrar(){
        in.close();
    }
}
