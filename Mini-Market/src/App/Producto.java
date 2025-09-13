
package App;


public class Producto {
    private int stock;
    private String nombre;
    private double precio;
    
    public Producto(int stock, String nombre, double precio){
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

public String getnombre(){
   return nombre;
}

public double getprecio(){
   return precio;
}

public int getStock(){
return stock;
}

    public void setStock(int stock){
    this.stock= stock;
}
    
@Override
 
public String toString(){
return nombre + " -s/." + precio + "- stock:" + stock;

}
}
