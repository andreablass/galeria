
public class Disco extends Obra {
    private String discografia;
    private int numeroCanciones;
   
    public Disco(){
        
    }
    
    public Disco(String titulo,Artista autor
            ,int anioEdicion, String discografia
            ,int numeroCanciones){
        super (titulo,autor,anioEdicion);
        this.discografia=discografia;
        this.numeroCanciones=numeroCanciones;
    }
   
   public String getDioscografia(){
        return discografia;
       
   }
   public void setDiscografia(String discografia){
       this.discografia=discografia;
   }
   public int getnumeroCanciones(){
        return numeroCanciones;
       
   }
   
   public void  setNumeroCanciones(int numeroCanciones){
       this.numeroCanciones=numeroCanciones;
       
   }
    public String toString(){
        return ("Disco "+" Discografia="+discografia+"numero Canciones"+numeroCanciones+super.toString());
     }
    
 
  
   
}
