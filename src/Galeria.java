
public class Galeria {

    public static void main(String[] args) {

//        Obra o=new Obra();
//        o.setTitulo("hola");
//        o.setAnioEdicion(2018);
//        
//        Artista autorObra=new Artista();
//        autorObra.setNombre("NOELIA");
//        autorObra.setanioNacimiento(1998);
//        o.setAutor(autorObra);
//        System.out.println(o.imprimir());
//--------------------------------
//    Artista autor=new Artista("JUANES", 20);
//       Disco dis=new Disco();
//     dis.setTitulo("santos");
//     dis.setAnioEdicion(2009);
//     dis.setAutor(autor);
//     dis.setNumeroCanciones(20);
//     dis.setDiscografia("la ranita");
//        System.out.println(dis.imprimir());

//_____________________________________________ DISCOGRAFIA
//        Disco discos[] = new Disco[3];
//       
//        discos[0]=new Disco();
//        discos[0].setTitulo("AGUA POR MI CASA");
//        discos[0].setAnioEdicion(2060);
//        discos[0].setDiscografia("EL JAGUAR");
//        discos[0].setNumeroCanciones(20);
//        discos[0].setAutor(new Artista("LA BURRA", 1987));
//        
//        discos[1]=new Disco("PRUEBA",new Artista("Esmeralda", 1998),
//                            2000,"INTERCOPE",20);
//        
//        discos[2]=new Disco();
//        for (Disco disco:discos) {
//            System.out.println(disco.imprimir());
//        }
// ___________________________________________ Artista
        Pelicula peliculas[]=new Pelicula[4];
        Artista art[]=new Artista[2];
        art[0]=new Artista("-----", 000);
        art[1]=new Artista("--------", 000);
        
    peliculas[0]=new Pelicula("LA VIVORA",new Artista("JUAN GOMES", 1990),2010,"DISCOVERY",art);
    peliculas[1]=new Pelicula("LA GARRA",new Artista("JUAN LOPEZ", 1990),2010,"MX",art);
    peliculas[2]=new Pelicula("LA CADENA",new Artista("JOSE MARTIENEZ", 1990),2010,"LOS MEXA",art);
    peliculas[3]=new Pelicula("LA CABRA MATADORA",new Artista("MARIENA ROBERTO", 1990),2010,"MEXAMEXICANO",art);
    
        for (Pelicula pelicula:peliculas) {
            System.out.println(pelicula.toString());
            
        }
    }
}
