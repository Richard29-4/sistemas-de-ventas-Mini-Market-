package sistemaventas;

public class Pago {
    private String metodo;
    private double monto;

    public Pago(String metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("\nro Pago realizado con " + metodo + " por el  monto de S/ " + monto);
        
    }
}

