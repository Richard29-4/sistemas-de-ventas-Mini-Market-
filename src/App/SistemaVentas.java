
package sistemaventas;

public class SistemaVentas {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Laptop", 3500.00);
        Producto producto2 = new Producto("Mouse", 80.00);
        Producto producto3 = new Producto("Teclado", 150.00);

        
        double precioConDescuento = producto3.aplicarDescuento(10);
        System.out.println("Precio con descuento del Teclado: S/ " + precioConDescuento);

        
        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        
        Cliente cliente = new Cliente("Richard Alejo", "78945612", "Lima");
        Vendedor vendedor = new Vendedor("Margaret Carrasco", "V001");

        
        carrito.mostrarCarrito();

        
        Factura factura = new Factura(1001, cliente, vendedor, carrito.calcularTotal());
        factura.mostrarFactura();

        Pago pago = new Pago("Tarjeta", carrito.calcularTotal());
        pago.procesarPago();
    }
}




