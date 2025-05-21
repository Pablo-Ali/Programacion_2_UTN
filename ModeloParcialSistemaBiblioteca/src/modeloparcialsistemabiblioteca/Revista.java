package modeloparcialsistemabiblioteca;

/**
 *
 * @author pablo
 */
public class Revista extends Publicacion{
    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, int añoPublicacion) {
        super(titulo, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    
    
    @Override
    public String toString(){
        return "Revista [numeroEdicion=" + numeroEdicion + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Revista revista = (Revista) obj;
        return this.añoPublicacion == revista.añoPublicacion &&
                this.titulo.equalsIgnoreCase(revista.titulo) &&
                this.numeroEdicion == revista.numeroEdicion;
    } 
}
