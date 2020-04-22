
public class  Obra {
    
    
    private String titulo;
    private Artista autor;
    private int anioEdicion;
     
    public Obra(){       
        autor=new Artista();
    }
    public Obra(String titulo,Artista autor,int anioEdicion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioEdicion=anioEdicion;
    }
    public String getTitulo(){
        
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    
}
   public Artista getAutor(){
       return autor;
   }
   public void setAutor(Artista autor){
       this.autor=autor;
   }
  public int getEdicion(){
      return anioEdicion;
  }
  public void setAnioEdicion(int anio){
      this.anioEdicion=anio;
  }
  
  public String toString(){
      return "OBRA : " + "  titulo="+titulo+"autor= "+autor.toString()
              +" anioEdicion= "+ anioEdicion;
  }
    
}
