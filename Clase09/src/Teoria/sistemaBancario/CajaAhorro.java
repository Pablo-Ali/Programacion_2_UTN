package Teoria.sistemaBancario;

/**
 *
 * @author pablo
 */
public class CajaAhorro extends CuentaBancaria{

    public CajaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }
    
    @Override
    public void extraer(double monto) {
        if(saldo >= monto){
            saldo -= monto;
            System.out.println("Extracción exitosa. Nuevo saldo: $" + saldo);
        } else{
            System.out.println("Fondos insuficientes");
        }
    }
    
}
