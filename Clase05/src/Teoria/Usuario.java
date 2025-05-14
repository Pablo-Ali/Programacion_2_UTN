package Teoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Usuario {
    private String nombre;
    private int numeroSocio;
    private List<Libro> librosPrestado;

    public Usuario(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.librosPrestado = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
    
    public void tomarPrestado(Libro libro) {
        librosPrestado.add(libro);
    }
    
    public void devolver(Libro libro) {
        librosPrestado.remove(libro);
    }
}
