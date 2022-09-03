package test;

public class Docotr {
    
    private String departamento;
    
    public Docotr( String departamento){
        this.departamento = departamento;
    }
    
    
    public String datos(){
        return ", Departamento: " + this.departamento;
    }
    
    
}
