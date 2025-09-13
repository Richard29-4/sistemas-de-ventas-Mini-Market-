
package App;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos ;
    
    public  Carrito(){
        productos = new ArrayList<>();
    }
    
   public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getStock() >= cantidad) {
            producto.setStock(producto.getStock() - cantidad); 
            for (int i = 0; i < cantidad; i++) {
                productos.add(producto);
            }
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println(" No hay suficiente stock.");
    }
   }
    
    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("\n--- Productos en el Carrito ---");
            for (Producto p: productos) {
                System.out.println(p.getNombre() + " - S/." + p.getPrecio());
            }
        }
    }

public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}
