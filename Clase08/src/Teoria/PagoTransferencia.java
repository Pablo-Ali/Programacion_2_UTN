/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class PagoTransferencia extends Pago{
    @Override
    public void realizarPago(double monto) {
        this.monto = monto;
        System.out.println("Pago con transferencia de $" + monto);
    }

    @Override
    public void realizarPago(double monto, String medio, String moneda) {
        monto = monto * 0.95;
        this.monto = monto;
        System.out.println("Transferencia de $" + monto + " desde cuenta " + medio + " en " + moneda);
    }

    
}