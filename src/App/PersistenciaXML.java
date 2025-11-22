package tu.paquete;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PersistenciaXML {

    public static void guardarCarrito(Carrito carrito) {
        try {
            XMLEncoder encoder = new XMLEncoder(
                new FileOutputStream("carrito.xml")
            );
            encoder.writeObject(carrito);
            encoder.close();
            System.out.println("Carrito guardado en carrito.xml");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public static Carrito cargarCarrito() {
        try {
            XMLDecoder decoder = new XMLDecoder(
                new FileInputStream("carrito.xml")
            );
            Carrito carrito = (Carrito) decoder.readObject();
            decoder.close();
            System.out.println("Carrito cargado exitosamente.");
            return carrito;
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
        return null;
    }
}
