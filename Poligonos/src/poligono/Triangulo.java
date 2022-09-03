package poligono;

public class Triangulo extends Poligono{
    private double lado1;
    private double lado2;
    private double base;
    
    public Triangulo(double lado1, double base){
        super(3);
        this.lado1 = this.lado2 = lado1;
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getBase() {
        return base;
    }
    
    @Override
    public double mostrarArea(){
        double area = this.lado1 * this.base;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() +"lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + '}';
    }
    
    
}
