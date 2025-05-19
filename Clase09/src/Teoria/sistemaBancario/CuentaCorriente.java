package Teoria.sistemaBancario;

/**
 *
 * @author pablo
 */
public class CuentaCorriente extends CuentaBancaria{
    private double limiteDescubierto;
    
    public CuentaCorriente(String titular, double saldo, double limiteDescubierto) {
        super(titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }
    
    
    @Override
    public void extraer(double monto) {
        if(saldo + limiteDescubierto >= monto){
            saldo -= monto;
            System.out.println("Extracción exitosa. Nuevo saldo: $" + saldo);
        }else {
            System.out.println("Fondos insuficientes.");
        }
    }
    
}
