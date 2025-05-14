/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class Pago {
    protected double monto;
    
    public void realizarPago(double monto) {
        this.monto = monto;
        System.out.println("Pago genérico de $" + monto );
    }
    
    public void realizarPago(double monto, String medio, String moneda) {
        this.monto = monto;        
        System.out.println("Pago genérico de $" + monto + " con " + medio + " en " + moneda);
    }
    
    public double getMonto() {
        return monto;
    }
    
}
