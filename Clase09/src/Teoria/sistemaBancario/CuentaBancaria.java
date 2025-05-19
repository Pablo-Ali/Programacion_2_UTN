package Teoria.sistemaBancario;

/**
 *
 * @author pablo
 */
public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
        saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo $" + saldo);
    }
    
    public void mostrarInformacion(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
    
    public abstract void extraer(double monto);
}
