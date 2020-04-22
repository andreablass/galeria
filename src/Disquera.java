
import java.util.Scanner;

public class Disquera {

    public static void main(String[] args) {
        Scanner poT = new Scanner(System.in);
        Scanner poN = new Scanner(System.in);
        Disco[] discos = new Disco[85];
        int opcion = 0;
        int indice = 0;
        String titulo = "";
        int anioEdicion = 0;
        String discografia = "";
        int numeroCanciones = 0;
        String nombreAutor = "";
        int anioNacimiento = 0;

        do {
            System.out.println("INGRESA LA OPCION A ELEGIR");
            System.out.println("1- PARA INGRESAR DATOS DE UN DISCO");
            System.out.println("2-ELIMINAR DISCO Y SUS DATOS");
            System.out.println("3-BUSCAR UN DISCO POR TITULO");
            System.out.println("4-MOSTRAR TODOS LOS DISCOS");
            System.out.println("5-MODIFICAR LOS DATOS DE UN DISCO");
            System.out.println("6-SALIR");

            opcion = poN.nextInt();
            switch (opcion) {

                case 1:

                    int espaciosDisponibles = 0;
                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i] == null) {
                            discos[i] = new Disco();
                            System.out.println("BIENVENIDO");
                            System.out.println("INGRESA TITULO DEL DISCO");
                            titulo = poT.nextLine();
                            discos[i].setTitulo(titulo);
                            System.out.println("AÑO DE EDICION");
                            anioEdicion = poN.nextInt();
                            discos[i].setAnioEdicion(anioEdicion);
                            System.out.println("INGRESA NOMBRE DE LA DISCOGRAFIA");
                            discografia = poT.nextLine();
                            discos[i].setDiscografia(discografia);
                            System.out.println("INGRESA NUMERO DE CANCIONES");
                            numeroCanciones = poN.nextInt();
                            discos[i].setNumeroCanciones(numeroCanciones);
                            System.out.println("INGRESA NOMBRE DEL AUTOR");
                            nombreAutor = poT.nextLine();
                            System.out.println("INGRESA SU AÑO DE NACIMIENTO");
                            anioNacimiento = poN.nextInt();
                            discos[i].setAutor(new Artista(nombreAutor, anioNacimiento));

                            break;
                        } else {
                            espaciosDisponibles++;
                        }
                    }
                    if (espaciosDisponibles == discos.length) {
                        System.out.println("NO HAY ESPACIO PARA AGREGAR OTRO DISCO");
                    }
                    break;
                case 2:
                    int intentos = 0;
                    System.out.println("INGRESA EL TITULO DEL DISCO A ELIMINAR ");
                    String tituloEliminar = poT.nextLine();
                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i]!=null && discos[i].getTitulo().equalsIgnoreCase(tituloEliminar)) {
                            System.out.println(discos[i].toString());
                            System.out.println("¿SEGURO DE ELIMINAR ESTE LIBRO? ");
                            String respuestaEliminar = poT.nextLine();
                            if (respuestaEliminar.equalsIgnoreCase("si")) {
                                discos[i] = null;
                                System.out.println("DISCO ELIMINADO");
                            } else {
                                System.out.println("DISCO NO BORRADO");
                            }
                            break;

                        } else {
                            intentos++;
                        }
                    }
                    
                    if (intentos == discos.length) {
                        System.out.println("NO SE ENCONTRO EL TITULO DEL DISCO");
                    }
                    break;
                case 3:
                    int intentosBuscar = 0;
                    System.out.println("INGRESA EL TITULO DEL DISCO A BUSCAR ");
                    String tituloBuscarar = poT.nextLine();
                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i]!=null && discos[i].getTitulo().equalsIgnoreCase(tituloBuscarar)) {
                            System.out.println(discos[i].toString());

                            break;

                        } else {
                            intentosBuscar++;
                        }
                    }

                    if (intentosBuscar == discos.length) {
                        System.out.println("NO SE ENCONTRO EL titulo DEL DISCO");
                    }

                    break;
                case 4:
                    for (Disco disco : discos) {
                        System.out.println(disco.toString());
                    }
                    break;
                case 5:
                    int intentosModificar = 0;
                    System.out.println("INGRESA EL TITULO DEL DISCO A BUSCAR ");
                    String tituloModificar = poT.nextLine();
                    for (int i = 0; i < discos.length; i++) {
                        if (discos[i]!=null && discos[i].getTitulo().equalsIgnoreCase(tituloModificar)) {
                            System.out.println(discos[i].toString());
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
                                   discos[i].setTitulo(poT.nextLine());
                                    break;
                                case 2:
                                    System.out.println("INGRESA LA NUEVA DISCOGRAFIA");
                                    discos[i].setDiscografia(poT.nextLine());
                                    break;
                                case 3:
                                    System.out.println("INGRESA EL NUEVO NUMERO DE CANCIONES");
                                    discos[i].setNumeroCanciones(poN.nextInt());
                                    break;
                                case 4:
                                    System.out.println("INGRESA EL NUEVO AÑO DE EDICION");
                                    discos[i].setAnioEdicion(poN.nextInt());
                                    break;
                                case 5:
                                    System.out.println("INGRESA EL NUEVO NOMBRE DE AUTOR");
//                                    discos[i].getAutor().setNombre(poT.nextLine());
                                    
                                    discos[i].setAutor(new Artista(poT.nextLine(), discos[i].getAutor().getAnioNacimie()));
                                    break;
                                case 6:
                                    System.out.println("INGRESA EL NUEVO AÑO DE NACIMIENTO");
                                    discos[i].getAutor().setanioNacimiento(poN.nextInt());
                                    break;
                                    
                                default:
                                    System.out.println("OPCION IN CORRECTA");
                                    break;

                            }
                            break;

                        } else {
                            intentosModificar++;
                        }
                    }

                    if (intentosModificar == discos.length) {
                        System.out.println("NO SE ENCONTRO EL titulo DEL DISCO");
                    }
                    break;
                case 6:
                    System.out.println("HASTA PRONTO :D");
                    opcion = 6;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }

        } while (opcion != 6);

    }

}
