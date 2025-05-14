package Teoria;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pablo
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }    
    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void prestarLibro(int numeroSocio, String codigoLibro) {
        Libro libro = buscarLibro(codigoLibro);
        Usuario usuario = buscarUsuario(numeroSocio);
        
        if ( libro != null && usuario != null && libro.estaDisponible()) {
            libro.prestadoA(usuario);
            usuario.tomarPrestado(libro);
            System.out.println("Libro prestado correctamente.");
        } else {
            System.out.println("No se pudo prestar el libro");
        }
        
    }
    
    public void devolverLibro(String codigoLibro) {
        Libro libro = buscarLibro(codigoLibro);
        if (libro != null && !libro.estaDisponible()) { // AND &&  OR  || NOT !
            Usuario usuario = libro.getPrestadoA();
            usuario.devolver(libro); // Sacar de lista de librosPrestado
            libro.devolver(); // atributo prestadoA lo va a poner en null
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("El libro ya esta disponible o no existe.");
        }
    }
    
    private Libro buscarLibro(String codigo) {
        for (Libro libro: libros) { //Recorre todo el array y cade elemento lo pones en la variable local libro
            if (libro.getCodigo().equals(codigo)) { // equals porque comparo Strings
                return libro;
            }
        }
        return null;        
    }
    
    private Usuario buscarUsuario(int numeroSocio) {
       // for es el ciclo de recorrido objeto por objeto 
       // usuarios es la colección
       // usuario es una variable temporal que toma el valor de cada elemento
       // Usuario es el tipo de objeto dentro de la coleccion        
        for (Usuario usuario: usuarios) {
            if (usuario.getNumeroSocio()  == numeroSocio) {
                return usuario;
            }
        }
        return null;
    }
    
    public void mostrarLibros() {
        for (Libro libro: libros) {
            System.out.println(libro.mostrarEstado());
        }
    }
    
}
