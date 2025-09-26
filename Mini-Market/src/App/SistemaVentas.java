
package App;

import java.util.ArrayList;
import java.util.Scanner;
import App.Producto;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        Carrito carrito = new Carrito();
        
        productos.add(new Producto("Arroz", 3.50, 100));
        productos.add(new Producto("Leche", 4.20, 50));
        productos.add(new Producto("Pan", 0.50, 200));
        
        int opcion;

        do {
            System.out.println("\n Sistema de Ventas ");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver carrito");
            System.out.println("4. Pagar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
    
            switch (opcion) {
                case 1:
                    System.out.println("\n Lista de Productos ");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i + 1) + ". " + productos.get(i));
                    }
                    break;
                    
                    case 2:
                    System.out.print("Elige el número del producto: ");
                    int numProd = sc.nextInt() - 1;
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    if (numProd >= 0 && numProd < productos.size()) {
                        carrito.agregarProducto(productos.get(numProd), cantidad);
                    } else {
                        System.out.println(" Producto inválido.");
                    }
                    break;
                    
                    
                    case 3:
                    carrito.mostrarCarrito();
                    break;

                case 4:
                    double total = carrito.calcularTotal();
                    System.out.println(" Total a pagar: S/." + total);
                    System.out.println("Gracias por su compra. ");
                    break;

                case 5:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}



