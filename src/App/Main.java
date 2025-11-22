package sistemaventas.app;

public class Main {
    public static void main(String[] args) {

        SistemaVentas sistema = SistemaVentas.getInstancia();

        // Mostrar productos cargados
        System.out.println("PRODUCTOS DISPONIBLES:");
        sistema.listarConLambda();

        // Usar carrito
        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Laptop", 3500));
        carrito.agregarProducto(new Producto("Mouse", 80));
        carrito.mostrarCarrito();

        // ======= GUARDAR EN XML =======
        PersistenciaXML.guardarCarrito(carrito);
        System.out.println("Carrito guardado en carrito.xml");

        // ======= CARGAR DESDE XML =======
        carrito = PersistenciaXML.cargarCarrito();
        System.out.println("Carrito cargado desde carrito.xml:");
        carrito.mostrarCarrito();
        // ================================

        // Cliente y vendedor
        Cliente cliente = new Cliente("Richard Alejo", "78945612", "Lima");
        Vendedor vendedor = new Vendedor("María Torres", "V001");

        // Factura
        Factura factura = new Factura(1001, cliente, vendedor, carrito.calcularTotal());
        factura.mostrarFactura();

        Pago pago = new Pago("Tarjeta", carrito.calcularTotal());
        pago.procesarPago();
    }
}

