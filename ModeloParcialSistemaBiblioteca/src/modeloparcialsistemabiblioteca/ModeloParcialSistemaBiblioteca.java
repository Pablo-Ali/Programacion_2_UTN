package modeloparcialsistemabiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ModeloParcialSistemaBiblioteca {

    public static void main(String[] args) {
        int opcion;

        Scanner console = new Scanner(System.in);

        List<Publicacion> listaPublicaciones = new ArrayList<>();

        Publicacion publicacion;

        do {
            System.out.println("\n#####-MENU-#####\n");
            System.out.println("1. Agregar publicacion");
            System.out.println("2. Mostrar publicaciones");
            System.out.println("3. Leer publicaciones");
            System.out.println("4. Ordenar segun año de publicacion");
            System.out.println("5. Ordenar alfabeticamente");
            System.out.println("0. Salir");

            opcion = console.nextInt();

            switch (opcion) {
                case 1:
                    agregarPublicacion(listaPublicaciones, console);
                    break;

                case 2:
                    mostrarPublicaciones(listaPublicaciones);
                    break;

                case 3:
                    leerPublicaciones(listaPublicaciones);
                    break;

                case 4:
                    ordenarPublicacionesSegunAño(listaPublicaciones);
                    break;

                case 5:
                    ordenarPublicacionesSegunTitulo(listaPublicaciones, new Comparador());
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    public static boolean compararExistente(Publicacion publicacion, List<Publicacion> lista) {
        return !lista.contains(publicacion);
    }

    public static void agregarPublicacion(List<Publicacion> listaPublicaciones, Scanner console) {
        int opcion;

        String titulo;
        int año;

        Publicacion publicacion;

        do {
            System.out.println("#####-AGREGAR PUBLICACION-#####");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar revista");
            System.out.println("3. Agregar ilustracion");
            System.out.println("0. Volver al menu");

            opcion = console.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el autor");
                    console.nextLine();
                    String autor = console.nextLine();

                    String genero;
                    do {
                        System.out.println("Ingrese el genero:\nFICCION\nNO_FICCION\nHISTORIA\nCIENCIA");
                        genero = console.nextLine().toUpperCase();
                    } while (!genero.equals("FICCION") && !genero.equals("NO_FICCION") && !genero.equals("HISTORIA") && !genero.equals("CIENCIA"));

                    System.out.println("Ingrese el titulo");
                    titulo = console.nextLine();

                    System.out.println("Ingrese el año de publicacion");
                    año = console.nextInt();

                    publicacion = new Libro(autor, genero, titulo, año);

                    if (compararExistente(publicacion, listaPublicaciones)) {
                        listaPublicaciones.add(publicacion);
                    } else {
                        System.out.println("El libro ya existe");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el numero de edicion");
                    int nro = console.nextInt();

                    System.out.println("Ingrese el titulo");
                    console.nextLine();
                    titulo = console.nextLine();

                    System.out.println("Ingrese el año de publicacion");
                    año = console.nextInt();

                    publicacion = new Revista(nro, titulo, año);

                    if (compararExistente(publicacion, listaPublicaciones)) {
                        listaPublicaciones.add(publicacion);
                    } else {
                        System.out.println("La revista ya existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el autor");
                    console.nextLine();
                    String nombre = console.nextLine();

                    System.out.println("Ingrese el ancho");
                    int ancho = console.nextInt();

                    System.out.println("Ingrese el alto");
                    int alto = console.nextInt();

                    System.out.println("Ingrese el titulo");
                    console.nextLine();
                    titulo = console.nextLine();

                    System.out.println("Ingrese el año de publicacion");
                    año = console.nextInt();

                    publicacion = new Ilustracion(nombre, ancho, alto, titulo, año);
                    if (compararExistente(publicacion, listaPublicaciones)) {
                        listaPublicaciones.add(publicacion);
                    } else {
                        System.out.println("La ilustracion ya existe");
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    public static void mostrarPublicaciones(List<Publicacion> listaPublicaciones) {
        if (listaPublicaciones.isEmpty()) {
            System.out.println("Aun no hay publicaciones");
        } else {
            for (int i = 0; i < listaPublicaciones.size(); i++) {
                System.out.println(listaPublicaciones.get(i).toString());
            }
        }
    }

    public static void leerPublicaciones(List<Publicacion> listaPublicaciones) {
        if (listaPublicaciones.isEmpty()) {
            System.out.println("Aún no hay publicaciones para leer.");
        } else {
            for (Publicacion p : listaPublicaciones) {
                if (p instanceof Legible) {
                    ((Legible) p).leer();
                } else {
                    System.out.println("Esta publicacion no puede leerse porque " + p.getTitulo() + " es una ilustracion");
                }
            }
        }
    }

    public static void ordenarPublicacionesSegunAño(List<Publicacion> listaPublicaciones) {
        if (listaPublicaciones.isEmpty()) {
            System.out.println("Aun no hay publicaciones");
        } else {
            Collections.sort(listaPublicaciones);
            for (int i = 0; i < listaPublicaciones.size(); i++) {
                System.out.println(listaPublicaciones.get(i).toString()
                        + " año: "
                        + listaPublicaciones.get(i).getAñoPublicacion());
            }
        }
    }

    public static void ordenarPublicacionesSegunTitulo(List<Publicacion> listaPublicaciones, Comparador comparador) {
        if (listaPublicaciones.isEmpty()) {
            System.out.println("Aun no hay publicaciones");
        } else {
            Collections.sort(listaPublicaciones, comparador);
            System.out.println("Publicaciones ordenadas alfabeticametne:");
            for (Publicacion p : listaPublicaciones) {
                System.out.println(p.getTitulo());
            }
        }
    }

    public static void mostrarIlustracionesOrdenadasPorArea(List<Publicacion> listaPublicaciones) {
        List<Ilustracion> ilustraciones = new ArrayList<>();

        for (Publicacion p : listaPublicaciones) {
            if (p instanceof Ilustracion) {
                ilustraciones.add((Ilustracion) p);
            }
        }

        Comparator<Ilustracion> porAreaDesc = new Comparator<Ilustracion>() {
            @Override
            public int compare(Ilustracion i1, Ilustracion i2) {
                double area1 = i1.getAncho() * i1.getAlto();
                double area2 = i2.getAncho() * i2.getAlto();
                return Double.compare(area2, area1);
            }
        };

        Collections.sort(ilustraciones, porAreaDesc);

        for (Ilustracion i : ilustraciones) {
            System.out.println(i);
        }
    }

    public static void mostrarPrimeraUltima(List<Publicacion> listaPublicaciones) {
        if (!listaPublicaciones.isEmpty()) {
            Publicacion masVieja = Collections.min(listaPublicaciones);
            Publicacion masNueva = Collections.max(listaPublicaciones);

            System.out.println("Publicación más antigua: " + masVieja);
            System.out.println("Publicación más reciente: " + masNueva);
        } else {
            System.out.println("No hay publicaciones para comparar.");
        }
    }
}
