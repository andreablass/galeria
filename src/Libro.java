
public class Libro extends Obra {
    private String editorial;
    private int numeroPaginas;
    

  public Libro(String titulo,Artista autor,int anioEdicion,String editorial,int numeroPaginas){
      super (titulo,autor,anioEdicion);
      this.editorial=editorial;
      this.numeroPaginas=numeroPaginas;
  }

    public Libro() {
        
    }
   
   public  String getEditorial(){
        return editorial;
         
     }
     public void setEditorial(String editorial){
         this.editorial=editorial;
     }
     public int getNumeroPaginas(int c){
        return numeroPaginas;
         
     }
     public void setNumeroPaginas(int numeropaginas){
         this.numeroPaginas=numeropaginas;
     }

    
    
     public String toString(){
       return "Libro"+" editorial="+editorial+"numero paginas"+numeroPaginas+super.toString();
     }
    
}
