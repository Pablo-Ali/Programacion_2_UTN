package ar.edu.utn.fra.prog2.modelo;

import java.io.Serializable;

/**
 *  
 * @author pablo
 */
public class Cuenta implements Serializable{
    private String pin;
    private double saldo;

    public Cuenta(String pin, double saldo) {
        this.pin = pin;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }
    }
    
    public boolean extraer(double monto){
        if(monto > 0 && monto <= saldo){
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    public boolean validarPin(String pin){
        return this.pin.equals(pin);
    }
}
