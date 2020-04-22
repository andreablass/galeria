

public class Artista {
    private String nombre;
    private int anioNacimiento;
    public Artista(){
        
    }
    public Artista(String nombre, int anioNacimiento){
        this.nombre=nombre;
        this.anioNacimiento=anioNacimiento;
    } 
    
    
    
    public int getAnioNacimie(){
        return anioNacimiento;
    }
    public void setanioNacimiento(int anio){
        this.anioNacimiento=anio;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public String toString(){ //El método toString nos permite mostrar 
        //la información completa de un objeto, es decir, el valor de sus atributos.
        return "ARTISTA "+" NOMBRE="+nombre+" AÑO DE NACIMIENTO"+anioNacimiento;
    }
    
}
