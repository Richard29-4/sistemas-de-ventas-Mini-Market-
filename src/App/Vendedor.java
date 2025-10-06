package sistemaventas;

public class vendedor {

public class Vendedor extends Persona {
    private String codigoVendedor;

    public Vendedor(String nombre, String dni, String codigoVendedor) {
        super(nombre, dni);
        this.codigoVendedor = codigoVendedor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Vendedor: " + nombre + " | Código: " + codigoVendedor);
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }
}
    
}