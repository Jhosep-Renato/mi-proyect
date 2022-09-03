package dispositivos;

public class Principal {
    
    public static void main(String[] args) {
        
        Teclado te = new Teclado("cable", "hp");
        Raton ra = new Raton("bluetoh", "hp");
        Monitor mo = new Monitor("HP", 50);
        
        Computadora co = new Computadora("HP", mo, te, ra);
        
        Teclado t = new Teclado("bluetoh", "wi");
        Raton r = new Raton("cable", "wi");
        Monitor m = new Monitor("wi", 80);
        
        Computadora c = new Computadora("w;i", m, t, r);
        Orden orden = new Orden();
        orden.agregarComputadoras(co);
        orden.agregarComputadoras(c);
        orden.mostrar();
    }
}
