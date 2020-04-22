
import java.util.ArrayList;
import java.util.List;

public class ColeccionHomogenea {

    public static void main(String[] args) {
        List<Pelicula> homogenea = new ArrayList<Pelicula>();
        ///// objeto 1

        Obra o = new Obra();
        o.setTitulo("hola");
        o.setAnioEdicion(2018);

        Artista autorObra = new Artista();
        autorObra.setNombre("NOELIA");
        autorObra.setanioNacimiento(1998);
        o.setAutor(autorObra);
        ////// objeto 2
        Artista autor = new Artista("JUANES", 20);
        Disco dis = new Disco();
        dis.setTitulo("santos");
        dis.setAnioEdicion(2009);
        dis.setAutor(autor);
        dis.setNumeroCanciones(20);
        dis.setDiscografia("la ranita");
        /// objeto 3
        Disco discos[] = new Disco[3];

        discos[0] = new Disco();
        discos[0].setTitulo("AGUA POR MI CASA");
        discos[0].setAnioEdicion(2060);
        discos[0].setDiscografia("EL JAGUAR");
        discos[0].setNumeroCanciones(20);
        discos[0].setAutor(new Artista("LA BURRA", 1987));

        discos[1] = new Disco("PRUEBA", new Artista("Esmeralda", 1998),
                2000, "INTERCOPE", 20);

        discos[2] = new Disco();
//// objeto 4
        Pelicula peliculas[] = new Pelicula[4];
        Artista art[] = new Artista[2];
        art[0] = new Artista("-----", 000);
        art[1] = new Artista("--------", 000);

        peliculas[0] = new Pelicula("LA VIVORA", new Artista("JUAN GOMES", 1990), 2010, "DISCOVERY", art);
        peliculas[1] = new Pelicula("LA GARRA", new Artista("JUAN LOPEZ", 1990), 2010, "MX", art);
        peliculas[2] = new Pelicula("LA CADENA", new Artista("JOSE MARTIENEZ", 1990), 2010, "LOS MEXA", art);
        peliculas[3] = new Pelicula();
        
  homogenea.add(new Pelicula("LA CABRA MATADORA", new Artista("MARIENA ROBERTO", 1990), 2010, "MEXAMEXICANO", art));
        System.out.println("....."+homogenea.size());
        for (Pelicula pelicula:homogenea) {
            System.out.println(pelicula.toString());
        }
    }
}
