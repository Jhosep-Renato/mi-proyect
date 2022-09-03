package domain;

import test.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Kii", 890);
       
        empleado = new Gerente("Kei", 42132, "Anchas");
        determinarTipo(empleado);
        System.out.println("Hola Mundo");
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
