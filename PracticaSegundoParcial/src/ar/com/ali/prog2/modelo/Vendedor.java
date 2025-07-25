package ar.com.ali.prog2.modelo;

import java.util.HashMap;

/**
 *
 * @author pablo
 */
public class Vendedor {
    private String usuario;
    private String pin;
    private int ventas;

    public Vendedor(String usuario, String pin, int ventas) {
        this.usuario = usuario;
        this.pin = pin;
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }
    
    //vender pasaje
    public void venderPasaje(int pasaje){
        if(pasaje > 0){
            ventas += pasaje;
        }
    }
    
    //validar pin
    public boolean validarPin(String usuario, String pin){
        if(this.usuario.equals(usuario) && this.pin.equals(pin)){
            return true;
        }
        return false;
    }
    
    public void registrarUsuario(String usuario, String pin, HashMap<String, Vendedor> vendedores){
        
    }
}
