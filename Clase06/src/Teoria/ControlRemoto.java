package Teoria;

/**
 *
 * @author pablo
 */
public class ControlRemoto {
    private Televisor televisor;
    
    public ControlRemoto(Televisor televisor) {
        this.televisor = televisor;
    }
    
    public void presionarBotonEncendido() {
        if (televisor.estaEncendido()) {
            televisor.apagar();
        } else {
            televisor.encender();
        }
    }

    public void presionarBotonInfo() {
        televisor.mostrarEstado();
    }

    public void presionarBotonSubirVolumen() {
        televisor.subirVolumen();
    }

    public void presionarBotonBajarVolumen() {
        televisor.bajarVolumen();
    }

    public void presionarBotonSubirCanal() {
        televisor.subirCanal();
    }

    public void presionarBotonBajarCanal() {
        televisor.bajarCanal();
    }

    public void presionarBotonCambiarCanal(int canal) {
        televisor.cambiarCanal(canal);
    }

    public void presionarBotonMute() {
        televisor.mute();
    }  
}