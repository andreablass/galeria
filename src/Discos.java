
public class Discos {
    private Disco[] discos;
    
    public Discos(){
        
    }
    public Discos(int tamanio){
        this.discos=new Disco[tamanio];
    }
        public void SetDiscos (Disco[] discos){
        this.discos=discos;
    }
    
    public Disco[]getDiscos(){
        return this.discos;
    }
    public boolean agregarDisco(Disco disco){
     
        boolean agregado=false;
        for (int i = 0; i <discos.length; i++) {
            if (discos[i]==null) {
             discos[i]=disco;
                agregado=true;
                break;
            }
            
        }
      
        return agregado;
    }
    public Disco buscarDiscoTitulo(String titulo){
        Disco disco =null;
        for (int i = 0; i < discos.length; i++) {
            if (discos[i]!= null && discos[i].getTitulo().equalsIgnoreCase(titulo)) {
                disco=discos[i];
                break;
            }
            
        }
       
        return disco;
    }
    public boolean eliminarDiscoTitulo(String titulo){
        boolean eliminado=false;
        
        for (int i = 0; i < discos.length; i++) {
            if (discos[i]!= null && discos[i].getTitulo().equalsIgnoreCase(titulo)) {
              discos[i]=null;
              break;
            }
        }
       
        return eliminado;
    }
        
    public boolean eliminarDisco(Disco disco){
        boolean eliminado=false;
        
        for (int i = 0; i < discos.length; i++) {
            if (discos[i]!= null && discos[i].getTitulo().equals(disco)) {
              discos[i]=null;
              break;
            }
        }
      
        return eliminado;
    }
    
    public boolean modificarDisco(Disco disco){
        boolean modificado =false;
        for (int i = 0; i < discos.length; i++) {
            if (discos[i]==null) {
                discos[i]=disco;
                modificado=true;
                break;
            }
        }
        
        return modificado;
    }
    
    public boolean disponibilidad (){
        boolean disponibilidad =false;
        int espaciosDisponibles=0;
        for (int i = 0; i < discos.length; i++) {
            if (discos[i]==null) {
                espaciosDisponibles++;
            }
        }
        if (espaciosDisponibles>0) {
            disponibilidad=true;
        }
        return disponibilidad;
    }
  

    
   public String mostrarDiscos(){
        String discosCadena=null;
        for ( Disco disco:this.discos) {
            if (disco!=null) {
                discosCadena=discosCadena + disco.toString()+"\n";
            }
        }
        return discosCadena;
        
   }
  
    
   
}
