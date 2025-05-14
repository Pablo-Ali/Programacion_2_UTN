package Teoria;

/**
 *
 * @author pablo
 */
public class Televisor {

    //Constante
    private static final int MAX_CANAL = 100;
    private static final int MIN_VOLUMEN = 0;
    private static final int MAX_VOLUMEN = 100;

    private final int tamanio;
    private final String color;
    private final String marca;
    private final String modelo;
    private boolean encendido;
    private int volumen;
    private int canal;
    private int volumenPrevio;
    
    /**
     * En Java hay un bloque especial de código que se utiliza para crear e
     * inicializar objetos de una clase. Su función principal es la de asignar
     * valores iniciales a los atributos de un objeto
     *
     */
    public Televisor(String marca, String modelo, String color, int tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamanio = tamanio;
        this.encendido = false;
        this.volumen = 10;
        this.canal = 1;        
    }

    /**
     * Cambia el canal indicado si es válido
     *
     * @param nuevoCanal Canal deseado
     */
    public void cambiarCanal(int nuevoCanal) {
        if (encendido && nuevoCanal >= 1 && nuevoCanal <= MAX_CANAL) {
            canal = nuevoCanal;
            System.out.println("Canal cambiado a: " + canal);
        } else {
            System.out.println("Canal inválido: el canal debe estar entre 1 y " + MAX_CANAL);
        }
    }

    /**
     * Muestra el estado del televisor
     */
    public void mostrarEstado() {
        System.out.println("--------- Estado del Televisor ---------");
        System.out.println("Marca: " + marca);
        System.out.println("Encendido: " + (encendido ? "Si" : "No"));
        System.out.println("Canal actual: " + canal);
        System.out.println("Volumen actual: " + volumen);
        System.out.println("---------------------------------------------");
    }

    /**
     * Enciende el televisor si está apagado
     */
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El televisor esta encendido.");
        } else {
            System.out.println("Ya está encendido.");
        }
    }

    /**
     * Apaga el televisor sí está encendido
     */
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El televisor está apagado");
        } else {
            System.out.println("Ya está apagado");
        }
    }
    
    /**
     * Baja el volumen en una unidad si no ha alcanzado el mínimo
     */
    public void bajarVolumen() {
        if (encendido && volumen > MIN_VOLUMEN) {    // || or   not !
            volumen--; // volumen = volumen - 1
            System.out.println("Volumen: " + volumen);
        } else {
            if (encendido) {
                System.out.println("Volumen mínimo alcanzado.");
            }
        }
    }
    
    /**
     * Sube el volumen en una unidad si no ha alcanzado el máximo
     */
    public void subirVolumen() {
        if (encendido && volumen < MAX_VOLUMEN) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        } else {
            if (encendido) {
                System.out.println("Volumen máximo alcanzado");
            }
        }
    }
    
    /**
     * Cambia el canal anterior de forma circular
     */
    public void bajarCanal() {
        if (encendido) {
            canal--;
            if (canal < 1) {
                canal = MAX_CANAL;
            }
            System.out.println("Canal: " + canal);
        } 
    }
    
    /**
     * Cambia el canal siguiente de forma circular
     */
    public void subirCanal() {
        if (encendido) {
            canal++;
            if (canal > MAX_CANAL) {
                canal = 1;
            }
            System.out.println("Canal: " + canal);
        }
    }
    
    public void mute() {
        if (encendido) {
            if (volumen > 0) {
                volumenPrevio = volumen;
                volumen = 0;
                System.out.println("Modo silencioso activado");
            } else {
                volumen = volumenPrevio;
                System.out.println("Modo sonido restaurado. Volumen: " + volumen);
            }
        }
    }
    
    public boolean estaEncendido() {
        return encendido;
    }  
}