package dispositivos;

public class Orden {
    
    private int idOrden;
    private static int contadorOrden;
    private Computadora computadoras[];
    private int contadorComputadora;
    private final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadoras(Computadora computadoras){
        if(this.contadorComputadora < this.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadora++] = computadoras;
        }
        else{
            System.out.println("Ya excedio el limite");
        }
    }
    
    public void mostrar(){
        System.out.println("ID Orden " + this.idOrden);
        
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
