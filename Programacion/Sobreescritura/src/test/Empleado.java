package test;

public class Empleado {
    protected String nombre;
    protected double saldo;
    
    public Empleado(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public String datos(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
