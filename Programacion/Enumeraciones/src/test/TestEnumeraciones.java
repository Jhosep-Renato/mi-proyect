package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 3: " + Dias.MIERCOLES);
//        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no. 4: " + Continentes.AFRICA);
        System.out.println("No. Paises en el 4to continente: " + Continentes.AFRICA.getPaises());
    }
    
    public static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
