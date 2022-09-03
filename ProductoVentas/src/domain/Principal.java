package domain;

import java.util.Scanner;
import orden.Orden;
import producto.Producto;

public class Principal {
    public static void main(String[] args) {
        
        Scanner valor = new Scanner(System.in);
        int opciones;
        
        Producto prod;
        Orden orden = new Orden();
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Productos ");
            System.out.println("3. Mostrar Total");
            System.out.println("4. Salir");
            opciones = valor.nextInt();
            
            switch(opciones){
                case 1: System.out.println("");
                        valor.nextLine();
                        System.out.print("Nombre Producto: ");
                        String producto = valor.nextLine();
                        System.out.print("Precio: ");
                        double precio = valor.nextDouble();
                        
                        prod = new Producto(producto, precio);
                        orden.agregarProductos(prod);
                        System.out.println("");
                        break;
                case 2: System.out.println("");
                        orden.mostrarProductos();
                        System.out.println("");
                        break;
                case 3: System.out.println("");
                        orden.Total();
                        System.out.println("");
                        break;
                case 4: break;
                
                default: System.out.println("Options incorrects");                       
            }
            
            
        }while(opciones != 4);
        
    }
}
