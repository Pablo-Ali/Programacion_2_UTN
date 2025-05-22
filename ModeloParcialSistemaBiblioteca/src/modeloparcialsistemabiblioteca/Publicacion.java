package modeloparcialsistemabiblioteca;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public abstract class Publicacion implements Comparable<Publicacion>{
    protected String titulo;
    protected int añoPublicacion;

    public Publicacion(String titulo, int añoPublicacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Publicacion publicacion = (Publicacion) obj;
        return this.titulo.equalsIgnoreCase(publicacion.titulo) && this.añoPublicacion == publicacion.añoPublicacion;
    }
    
    @Override
    public int compareTo(Publicacion otra){
        return Integer.compare(this.añoPublicacion, otra.añoPublicacion);
    }

}
