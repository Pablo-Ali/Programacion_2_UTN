package modeloparcialsistemabiblioteca;

/**
 *
 * @author pablo
 */
public class Libro extends Publicacion{
    
    private String autor;
    private String genero;

    public Libro(String autor, String genero, String titulo, int añoPublicacion) {
        super(titulo, añoPublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return "Libro [autor=" + autor +", genero=" + genero + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Libro libro = (Libro) obj;
        return this.añoPublicacion == libro.añoPublicacion &&
                this.titulo.equalsIgnoreCase(libro.titulo) &&
                this.autor.equalsIgnoreCase(libro.autor) &&
                this.genero.equalsIgnoreCase(libro.genero);
    }   
}
