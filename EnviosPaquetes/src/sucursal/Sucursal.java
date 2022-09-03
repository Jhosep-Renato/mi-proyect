package sucursal;
import paquete.Paquete;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    
    public Sucursal(int numeroSucursal, String direccion, String ciudad){
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public double calcularPrecio(Paquete t){
        double precio = 0;
        if(t.getPrioridadPaquete() == 1){
            precio = (t.getPeso() * 2) + 10;
        } else if(t.getPrioridadPaquete() == 2){
            precio = (t.getPeso() * 2) + 20;
        }
        return precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sucursal{");
        sb.append("numeroSucursal=").append(numeroSucursal);
        sb.append(", direccion=").append(direccion);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }   
}
