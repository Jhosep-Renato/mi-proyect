package test;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double saldo, String departamento){
        super(nombre, saldo);
        this.departamento = departamento;
    }
    
    @Override
    public String datos(){
        return super.datos() + ", Departamento: " + this.departamento;
    }
    
    public void meto(){
        System.out.println(this.getNombre());
    }
    
    
}
