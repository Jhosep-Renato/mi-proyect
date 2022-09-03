package poligono;

public abstract class Poligono {
    
    protected int nmrLados;
    
    public Poligono(int nmrLados){
        this.nmrLados = nmrLados;
    }

    public int getNmrLados() {
        return nmrLados;
    }
    
    @Override
    public String toString() {
        return "nmrLados=" + this.nmrLados;
    }    
    
    public abstract double mostrarArea();
}
