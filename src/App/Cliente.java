package sistemaventas;
public class cliente {


public class Cliente extends Persona {
    private String direccion;

    public Cliente(String nombre, String dni, String direccion) {
        super(nombre, dni);
        this.direccion = direccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " | DNI: " + dni + " | Dirección: " + direccion);
    }

    public String getDireccion() {
        return direccion;
    }
}
    
}
