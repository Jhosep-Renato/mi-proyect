package herencia;

public class Estudiante extends Persona{
    
    private int idEstudiante;
    private static int contador;
    
    
    public Estudiante(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.idEstudiante = ++Estudiante.contador;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + ""
                + "\nApellido: " + getApellido() + ""
                        + "\nEdad: " + getEdad() + ""
                                + "\nId Estudiante: " + this.idEstudiante);
    }
}
