package paquete;

public class Paquete {
    private int numeroReferencia;
    private int dni;
    private int prioridadPaquete;
    private int peso;
    
    public Paquete(int numeroReferencia, int dni, int prioridadPaquete, int peso){
        this.peso = peso;
        this.numeroReferencia = numeroReferencia;
        this.dni = dni;
        this.prioridadPaquete = prioridadPaquete;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public int getDni() {
        return dni;
    }

    public int getPrioridadPaquete() {
        return prioridadPaquete;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paquete{");
        sb.append("numeroReferencia=").append(numeroReferencia);
        sb.append(", dni=").append(dni);
        sb.append(", prioridadPaquete=").append(prioridadPaquete);
        sb.append('}');
        return sb.toString();
    }
    
    
}
