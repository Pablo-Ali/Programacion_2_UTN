package Teoria;

/**
 *
 * @author pablo
 */
public class SistemaGestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN FRA");

        Libro l1 = new Libro("Harry Potter: La piedra filosofal", "Rowling", "1001");   // ejecutando el constructura de libro
        Libro l2 = new Libro("1984", "Orwell", "1002");

        Usuario u1 = new Usuario("Daniel", 1);
        Usuario u2 = new Usuario("Valeria", 2);

        //Agregamos los libros al stock de la biblioteca
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        //Registrar socios
        biblioteca.registrarUsuario(u2);
        biblioteca.registrarUsuario(u1);             

        System.out.println("Mostrar estado de stock antes de prestar");
        biblioteca.mostrarLibros();

        //Prestar libros
        biblioteca.prestarLibro(1, "1001");

        System.out.println("Mostrar estado de stock despues de prestar");
        biblioteca.mostrarLibros();

        // Devolución del libro
        biblioteca.devolverLibro("1001");
        System.out.println("Mostrar estado de stock despues de devolver");
        biblioteca.mostrarLibros();

        biblioteca.devolverLibro("2001");

    }
}