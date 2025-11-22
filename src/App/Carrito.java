
package sistemaventas;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarCarrito() {
        System.out.println("\n🛒 Productos en el carrito:");
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}
