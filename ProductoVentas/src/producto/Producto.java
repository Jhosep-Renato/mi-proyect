package producto;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre(){ return this.nombre; }
    
    public double getPrecio(){ return this.precio; }
    
    public int getIdProducto(){ return this.idProducto; }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}
