
import java.util.ArrayList;
import java.util.List;

public class Colecciones {

    public static void main(String[] args) {
        List <Pelicula> heterogenea = new ArrayList<Pelicula>();
        System.out.println("----//" + heterogenea.size());
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

        heterogenea.add(o);
        heterogenea.add(dis);
        heterogenea.add(discos);
        heterogenea.add(new String("JOEGUE"));
        heterogenea.add("SAMUEL");
        
        
        System.out.println("----//" + heterogenea.size());
        for (Object O : heterogenea) {
            System.out.println(O.toString());
        }
        
        System.out.println("SAMUEL ¿ ESTAS?"+heterogenea.contains("SAMUEL"));
        System.out.println("DISCOS ¿ ESTAS?"+heterogenea.contains(discos));
        heterogenea.remove(discos);
        System.out.println("----//" + heterogenea.size());
        System.out.println("DISCOS ¿ ESTAS?"+heterogenea.contains(discos));

        for (Object O : heterogenea) {
            System.out.println(O.toString());
        }
        heterogenea.clear();
        System.out.println("----//" + heterogenea.size());
        for (Object O : heterogenea) {
            System.out.println(O.toString());
        }
        

    }

}
