package Teoria.sistemaBancario;

/**
 *
 * @author pablo
 */
public class SistemaBancario {
    public static void main(String[] args){
        CuentaBancaria c1 = new CajaAhorro("Juan Perez", 1000);
        CuentaBancaria c2 = new CuentaCorriente("Ana Gomez", 500, 200);
        
        c1.mostrarInformacion();
        c1.extraer(1200);
        c1.extraer(800);
        
        System.out.println("-----");
        
        c2.mostrarInformacion();
        c2.extraer(600);
        c2.extraer(200);
    }
}
