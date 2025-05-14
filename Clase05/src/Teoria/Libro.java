package Teoria;

/**
 *
 * @author pablo
 */
public class Libro {
    private String titulo;
    private String autor;
    private String codigo;
    private Usuario prestadoA;
    
    /**
     * Constructor de un libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param codigo codigo identificario 
     */
    public Libro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.prestadoA = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void prestadoA(Usuario usuario) {
        this.prestadoA = usuario;
    }

    public boolean estaDisponible() {
        return prestadoA == null;
    }
  
    public String mostrarEstado() {
        return titulo + " (" + autor + ") - Codigo: " + codigo +
                ( estaDisponible() ? " [Disponible] " : "[Prestado a: " + prestadoA.getNombre());
    }
    
    public void devolver() {
        this.prestadoA = null;
    }

    public Usuario getPrestadoA() {
        return prestadoA;
    }
}
