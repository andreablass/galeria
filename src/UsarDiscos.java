
import java.util.Scanner;

public class UsarDiscos {

    public static void main(String[] args) {
        Scanner poN = new Scanner(System.in);
        Scanner poT = new Scanner(System.in);
        System.out.println("¿CUANTOS DISCOS DESEAS INGRESAR");
        int tamanio = poN.nextInt();
        Discos disqueraUtez = new Discos(tamanio);
        do {
            System.out.println("INGRESA LA OPCION A ELEGIR");
            System.out.println("1- PARA INGRESAR DATOS DE UN DISCO");
            System.out.println("2-ELIMINAR DISCO Y SUS DATOS");
            System.out.println("3-BUSCAR UN DISCO POR TITULO");
            System.out.println("4-MOSTRAR TODOS LOS DISCOS");
            System.out.println("5-MODIFICAR LOS DATOS DE UN DISCO");
            System.out.println("6-SALIR");
            int opcion = poN.nextInt();
            switch (opcion) {
                case 1:
                    if (disqueraUtez.disponibilidad()) {
                        Disco nuevo = new Disco();

                        System.out.println("INGRESA EL TITULO");
                        nuevo.setTitulo(poT.nextLine());
                        System.out.println("INGRSE EL AÑO DE LA EDICION");
                        nuevo.setAnioEdicion(poN.nextInt());
                        System.out.println("INGRESE LA DISCOGRAFIA");
                        nuevo.setDiscografia(poT.nextLine());
                        System.out.println("INGRESA EL NUMERO E CANCIONES");
                        nuevo.setNumeroCanciones(poN.nextInt());
                        Artista autor = new Artista();
                        System.out.println("INGRESA NOMBRE DEL AUTOR");
                        autor.setNombre(poT.nextLine());
                        System.out.println("INGRESA EL AÑO DE NACIMIENTO DEL AUTOR");
                        autor.setanioNacimiento(poN.nextInt());

                        nuevo.setAutor(autor);
                        boolean agregado = disqueraUtez.agregarDisco(nuevo);
                        if (agregado) {
                            System.out.println("DISCO AGRREGADO");
                        }
                    } else {
                        System.out.println("NO HAY ESPACIOS DISPOIBLES");
                    }
                    break;
                case 2:
                    System.out.println("INGRESA EN TITULO DES DISCO");
                    String tituloEliminar = poT.nextLine();
                    Disco discoEliminar = disqueraUtez.buscarDiscoTitulo(tituloEliminar);
                    if (discoEliminar != null) {

                        boolean elimidado = disqueraUtez.eliminarDiscoTitulo(tituloEliminar);
                        if (elimidado) {
                            System.out.println("EL DISCO SE A ELIMINADO CORRECTAMENTEl");
                        }
                    } else {
                        System.out.println("NO SE ENCONTRO EL DISCO");
                    }

                    break;
                case 3:
                    System.out.println("INGTESA EL TITULO DEL DISCO A BUSCAR");
                    String tituloBuscar = poT.nextLine();
                    Disco discoBuscar = disqueraUtez.buscarDiscoTitulo(tituloBuscar);
                    if (discoBuscar != null) {
                        System.out.println(discoBuscar.toString());
                    } else {
                        System.out.println("NO SE ENCONTRO EL DISCO");
                    }
                    break;
                case 4:
                    System.out.println(disqueraUtez.mostrarDiscos());

                    break;
                case 5:
                    System.out.println("INGRESAR EL TITULO DEL DISCO A MODIFICAR");
                    String tituloModificar = poT.nextLine();
                    Disco discoModificar = disqueraUtez.buscarDiscoTitulo(tituloModificar);
                    if (discoModificar != null) {

                    } else {
                        System.out.println("NO SE ENCONTRO EL DISCO");
                    }
                    break;
                case 6:
                    System.out.println("INGRESA EL TITULO DEL DISCO A BUSCAR ");
                    String tituloModificarr = poT.nextLine();
                  Disco discosModificar=disqueraUtez.buscarDiscoTitulo(tituloModificarr);
                    if (discosModificar!=null) {
                        
                    
                            System.out.println("¿QUE DESEAS MODIFICAR?");
                            System.out.println("1. Titulo");
                            System.out.println("2. Discografia");
                            System.out.println("3. Numero de canciones");
                            System.out.println("4. Año de edicion");
                            System.out.println("5. Nombre del autor");
                            System.out.println("6. Año de nacimiento del autor");
                            int respuestaModificar = poN.nextInt();
                            switch (respuestaModificar) {
                                case 1:
                                    System.out.println("INGRESA EL NUEVO TITULO");
                                    discosModificar.setTitulo(poT.nextLine());
                                    break;
                                case 2:
                                    System.out.println("INGRESA LA NUEVA DISCOGRAFIA");
                                    discosModificar.setDiscografia(poT.nextLine());
                                    break;
                                case 3:
                                    System.out.println("INGRESA EL NUEVO NUMERO DE CANCIONES");
                                    discosModificar.setNumeroCanciones(poN.nextInt());
                                    break;
                                case 4:
                                    System.out.println("INGRESA EL NUEVO AÑO DE EDICION");
                                    discosModificar.setAnioEdicion(poN.nextInt());
                                    break;
                                case 5:
                                    System.out.println("INGRESA EL NUEVO NOMBRE DE AUTOR");
//                                    discos[i].getAutor().setNombre(poT.nextLine());

                                    discosModificar.setAutor(new Artista(poT.nextLine(), discosModificar.getAutor().getAnioNacimie()));
                                    break;
                                case 6:
                                    System.out.println("INGRESA EL NUEVO AÑO DE NACIMIENTO");
                                    discosModificar.getAutor().setanioNacimiento(poN.nextInt());
                                    break;

                                default:
                                    System.out.println("OPCION IN CORRECTA");
                                    
                                    
                            }
                            if (disqueraUtez.modificarDisco(discosModificar)) {
                                System.out.println("SE HA MODIFICADO CORRECTAMENTE");
                        }else{
                        System.out.println("SE LOGRO MODIFICAR EL DISCO");
                    }
                            
                            
                      
                            }else{
                        System.out.println("NO SE ENCONTRO EL DISCO");
                    }
            break;
            

          default:
                    break;

            }
        
    }while (true);

    }
}
