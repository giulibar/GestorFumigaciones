package obligatorio2;

import dominio.*;
import interfaz.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EjecutarProyecto {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // reconstruyo

        try {
            FileInputStream arch2 = new FileInputStream("Datos");
            ObjectInputStream in = new ObjectInputStream(arch2);
            Sistema sistema = (Sistema) in.readObject();
            arch2.close();
            VentanaMenu menu = new VentanaMenu(sistema);
            menu.setVisible(true);
        } catch (FileNotFoundException e) {
            Sistema sistema = new Sistema();
            VentanaMenu menu = new VentanaMenu(sistema);
            menu.setVisible(true);
        }
    }
}
