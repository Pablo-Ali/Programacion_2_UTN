package modeloparcialsistemabiblioteca;

import java.util.Comparator;

/**
 *
 * @author pablo
 */
public class Comparador implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
    }
}
