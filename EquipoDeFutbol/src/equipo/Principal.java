package equipo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static ArrayList<Persona> persona = new ArrayList<>();
    static Scanner valor = new Scanner(System.in);
    
    static Persona fut = new Futbolista("Kioytaka", "Ayanon", 21, 12, "delantero");
    static Persona fut2 = new Futbolista("Kei", "paulo", 23, 11, "defensor");
    static Persona entre = new Entrenador("Koenji", "add", 50, "ganar");
    static Persona doc = new Medico("Medi", "Piropo", 67, "Titulo alto", 34);
    
    public static void main(String[] args) {
        
        persona.add(fut);
        persona.add(fut2);
        persona.add(entre);
        persona.add(doc);
        
        menu();
    }
    
    public static void menu(){
        int opciones;
        do{
            System.out.println("...OPCIONES...");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar ENtren,iento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            opciones = valor.nextInt();
            
            switch(opciones){
                case 1:System.out.println("");  
                    viajando();//viaje
                        break;
                case 2:System.out.println(""); 
                    entrenarEquipo();//entrenar
                        break;
                case 3:System.out.println(""); 
                    partidoFutbol();//partido de futbol
                        break;
                case 4:System.out.println(""); 
                    planificar();//planificar entrenamiento
                        break;
                case 5: System.out.println("");
                    entrevista();//entrevista
                        break;
                case 6: System.out.println("");
                        curar();//curar lesion
                        break;
                case 7: break;
                
                default:  System.out.println("Ingrese la opcion correcta");
            }
        }while(opciones != 7);
    }
    
    public static void viajando(){
        
        for(Persona per: persona){
            System.out.print(per.getNombre() + " " + per.getApellido() + "-->");
            per.viajar();
        }
    }
    
    public static void entrenarEquipo(){
        
        for(Persona per: persona){
            System.out.print(per.getNombre() + " " + per.getApellido() + "-->");
            per.entrenamiento();
        }
    }
    
    public static void partidoFutbol(){
        for(Persona per: persona){
            System.out.print(per.getNombre() + " " + per.getApellido() + "-->");
            per.partidoFutbol();
        }
    }
    
    public static void planificar(){
        System.out.print(entre.getNombre() + " " + entre.getApellido() + "-->");
        ((Entrenador)entre).planificarEntrenamiento();
    }
    
    public static void entrevista(){
        System.out.println(fut.getNombre() + " " + fut.getApellido() + "-->");
        ((Futbolista)fut).entrevista();
        
        System.out.println(fut2.getNombre() + " " + fut2.getApellido() + "-->");
        ((Futbolista)fut2).entrevista();
    }
    
    public static void curar(){
        System.out.println(doc.getNombre() + " " + doc.getApellido() + "-->");
        ((Medico)doc).curarLesion();
    }
}
