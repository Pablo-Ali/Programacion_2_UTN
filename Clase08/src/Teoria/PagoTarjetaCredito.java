/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class PagoTarjetaCredito extends Pago{
   @Override
    public void realizarPago(double monto) {
        monto = monto * 1.05;
        this.monto = monto;
        System.out.println("Pago con Tarjeta recargo 5% $" + monto);
    }

    @Override
    public void realizarPago(double monto, String medio, String moneda) {
        monto = monto * 1.05;
        this.monto = monto;
        System.out.println("Pago con Tarjeta recargo 5% " + medio + " de $ " + monto + " en " + moneda);
    }
    
}