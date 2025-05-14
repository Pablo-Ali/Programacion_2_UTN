/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class PagoEfectivo extends Pago {
    @Override
    public void realizarPago(double monto) {
        monto = monto * 0.95;
        this.monto = monto;
        System.out.println("Pago en efecto con descuento 5% $" + monto);
    }

    @Override
    public void realizarPago(double monto, String medio, String moneda) {
        monto = monto * 0.95;
        this.monto = monto;
        System.out.println("Pago en efecto con descuento 5% $" + monto + " en " + moneda + " con " + medio);
    }

}