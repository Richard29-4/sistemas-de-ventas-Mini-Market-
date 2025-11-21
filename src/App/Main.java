package sistemaventas;

public class Main {
    public static void main(String[] args) {

        SistemaVentas sistema = SistemaVentas.getInstancia();

        System.out.println("PRODUCTOS DISPONIBLES:");
        sistema.listarConLambda();

        Carrito carrito = new Carrito();
        carrito.agregarProducto(new Producto("Laptop", 3500));
        carrito.agregarProducto(new Producto("Mouse", 80));
        carrito.mostrarCarrito();

        Cliente cliente = new Cliente("Richard Alejo", "78945612", "Arequipa");
        Vendedor vendedor = new Vendedor("María Torres", "V001");

        Factura factura = new Factura(1001, cliente, vendedor, carrito.calcularTotal());
        factura.mostrarFactura();

        Pago pago = new Pago("Tarjeta", carrito.calcularTotal());
        pago.procesarPago();
    }
}



