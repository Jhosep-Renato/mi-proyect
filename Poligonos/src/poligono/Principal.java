package poligono;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner valor = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        llenarPoligono();
        mostrarDatos();
    
    }
    
    public static void llenarPoligono(){
        int opciones;
        char v;
        do{
            do{
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("3. Salir");
                opciones = valor.nextInt();
                
                switch(opciones){
                    case 1: llenarTriangulo();
                            //Triangulo
                            break;
                    case 2: llenarRectangulo();
                            //Rectangulo
                            break;
                    case 3: break;
                    default: System.out.println("Ingrese la opcion correcta");
                }
            }while(opciones < 1 || opciones > 3);
            
            System.out.println("Quiere seguir ingresando datos ? (s/n)");
            v = valor.next().charAt(0);
            
        }while(v == 's' || v == 'S');
        
        
    }
    
    public static void llenarTriangulo(){
        double base, altura;
        System.out.print("Ingrese la base: ");
        base = valor.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = valor.nextDouble();
        
        Triangulo tr = new Triangulo(altura, base);
        poligonos.add(tr);
    }
    
    public static void llenarRectangulo(){
        double base, altura;
        System.out.print("Ingrese la base: ");
        base = valor.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = valor.nextDouble();
        
        Rectangulo rec = new Rectangulo(altura, base);
        poligonos.add(rec);
    }
    
    public static void mostrarDatos(){
        for (Poligono poli: poligonos) {
            System.out.println(poli.toString());
        }
    }
}
