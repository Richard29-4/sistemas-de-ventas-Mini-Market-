package sistemaventas;

public class Factura {
    private int numeroFactura;
    private Cliente cliente;
    private Vendedor vendedor;
    private double total;

    public Factura(int numeroFactura, Cliente cliente, Vendedor vendedor, double total) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
    }

    public void mostrarFactura() {
        System.out.println("\nro FACTURA #:" + numeroFactura);
        cliente.mostrarInformacion();
        vendedor.mostrarInformacion();
        System.out.println("Total a pagar: S/ " + total);
    }
}

