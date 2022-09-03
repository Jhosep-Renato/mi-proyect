package poligono;

public class Rectangulo extends Poligono{
    
    private double altura;
    private double base;
    
    public Rectangulo(double altura, double base){
        super(2);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }  
    
    @Override
    public double mostrarArea(){
        double area =  this.altura * this.base;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Lados: " + super.toString() + "altura=" + altura + ", base=" + base + '}';
    }
    
    
}
