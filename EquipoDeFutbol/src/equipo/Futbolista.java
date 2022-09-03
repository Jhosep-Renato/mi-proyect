package equipo;

public class Futbolista extends Persona{
   private int dorsal;
   private String posicion;
   
   public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion){
       super(nombre, apellido, edad);
       this.dorsal = dorsal;
       this.posicion = posicion;
   }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
   
   @Override
    public void partidoFutbol(){
        System.out.println("Juega en el partido de futbool");
    }
    
   @Override
    public void entrenamiento(){
       System.out.println("Entrena para el partido de futbol");  
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }
}
