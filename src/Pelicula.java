
import java.util.Arrays;


public class Pelicula extends Obra {
    private String productora;
    private Artista[] interpretes;
 
    
    public Pelicula(){
        
    }
    
    public Pelicula(String titulo,Artista autor
            ,int anioEdicion,String productora,Artista[] interpretes){
        super (titulo,autor,anioEdicion);
        this.productora=productora;
        this.interpretes=interpretes;
    }
    public Artista[] getinterpretes(){
        return interpretes;
        
    }
    public void setinterpretes(Artista[] artista){
        this.interpretes=artista;
        
    }
    public String getProductora(){
        return productora;
        
    }
    public void setProductora(String productora){
        this.productora=productora;
    }
    public String toString(){
        return"PELICULA :"+" PRODUCTORIA="+productora+", INTERPRETES="+Arrays.toString(interpretes)+super.toString();
    }
    
    
    
}
