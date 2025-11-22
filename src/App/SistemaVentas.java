package sistemaventas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SistemaVentas {

    private static SistemaVentas instancia;

    private ArrayList<Producto> productosDisponibles;

    // Constructor privado (Singleton)
    private SistemaVentas() {
        productosDisponibles = new ArrayList<>();
        cargarProductos();
    }

    // Obtener única instancia
    public static SistemaVentas getInstancia() {
        if (instancia == null) {
            instancia = new SistemaVentas();
        }
        return instancia;
    }

    // Cargar productos iniciales al sistema
    private void cargarProductos() {
        productosDisponibles.add(new Producto("Laptop", 3500.00));
        productosDisponibles.add(new Producto("Mouse", 80.00));
        productosDisponibles.add(new Producto("Teclado", 150.00));
    }

    // ========== MÉTODOS CON LAMBDA ==========

    public void listarConLambda() {
        productosDisponibles.forEach(p -> System.out.println(p));
    }

    public void filtrarProductos(Predicate<Producto> condicion) {
        productosDisponibles.stream()
            .filter(condicion)
            .forEach(System.out::println);
    }

    public void ordenarPorNombre() {
        productosDisponibles.sort(
            (a, b) -> a.getNombre().compareTo(b.getNombre())
        );
    }

    // Para obtener los productos (por si los necesitas)
    public ArrayList<Producto> getProductos() {
        return productosDisponibles;
    }
}

