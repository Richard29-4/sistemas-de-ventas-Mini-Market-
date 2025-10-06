 package sistemaventas;
public class persona {
  

public abstract class Persona {
    protected String nombre;
    protected String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

   
    public abstract void mostrarInformacion();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}
 
}
