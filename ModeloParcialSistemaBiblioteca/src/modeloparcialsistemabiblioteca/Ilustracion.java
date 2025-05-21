package modeloparcialsistemabiblioteca;

/**
 *
 * @author pablo
 */
public class Ilustracion extends Publicacion{
    private String nombreIlustrador;
    private double ancho;
    private double alto;

    public Ilustracion(String nombreIlustrador, double ancho, double alto, String titulo, int añoPublicacion) {
        super(titulo, añoPublicacion);
        this.nombreIlustrador = nombreIlustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getNombreIlustrador() {
        return nombreIlustrador;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setNombreIlustrador(String nombreIlustrador) {
        this.nombreIlustrador = nombreIlustrador;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public String toString(){
        return "Ilustracion [ilustrador=" + nombreIlustrador +", ancho=" + ancho + ", alto=" + alto +"]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Ilustracion ilustracion = (Ilustracion) obj;
        return this.añoPublicacion == ilustracion.añoPublicacion &&
                this.titulo.equalsIgnoreCase(ilustracion.titulo) &&
                this.nombreIlustrador.equalsIgnoreCase(ilustracion.nombreIlustrador) &&
                Double.compare(this.ancho, ilustracion.ancho) == 0 &&
                Double.compare(this.alto, ilustracion.alto) == 0;
    } 
}


