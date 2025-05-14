/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Polimorfismo en ejecucion Sobrecarga de métodos Diseño extensible
 *
 */
public class SistemaFormaPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Pago pago1 = new Pago();
//        pago1.realizarPago(1000);
//        pago1.realizarPago(2000, "Mostrador", "AR$");
//        
//        Pago pago2 = new PagoEfectivo();
//        pago2.realizarPago(1000);
//        pago2.realizarPago(1000, "Caja", "AR$");
//        
//        Pago pago3 = new PagoTarjetaCredito();
//        pago3.realizarPago(2500);
//        pago3.realizarPago(2500, "Visa", "USD");
//       
//        Pago pago4 = new PagoTransferencia();
//        pago4.realizarPago(5000);
//        pago4.realizarPago(5000, "CBU123456", "EUR");  
//     
        //Creamos una lista de pagos
        List<Pago> listaDePagos = new ArrayList<>();
        double total = 0;
        int opcion;
        Scanner sc = new Scanner(System.in);
        Pago pago;

        do {
            System.out.println(" Menú opciones");
            System.out.println("1. Pago Efectivo");
            System.out.println("2. Pago Tarjeta");
            System.out.println("3. Pago Transferencia");
            System.out.println("4. Arqueo de Caja");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    pago = new PagoEfectivo();  // Momento el cajero nos pregunta el tipo de pago...pago en efectivo        
                    System.out.println("Ingrese el monto en efectivo");
                    double montoEfectivo = sc.nextDouble();
                    pago.realizarPago(montoEfectivo);  // confirma que recibió el dinero
                    listaDePagos.add(pago);  // Graba la transacción      
                    break;
                case 2:
                    pago = new PagoTarjetaCredito();  // Momento el cajero nos pregunta el tipo de pago...pago en efectivo        
                    System.out.println("Ingrese el monto de la tarjeta");
                    double montoTarjeta = sc.nextDouble();
                    pago.realizarPago(montoTarjeta);  // confirma que recibió el dinero
                    listaDePagos.add(pago);  // Graba la transacción      
                    break;
                case 3:
                    pago = new PagoTransferencia();  // Momento el cajero nos pregunta el tipo de pago...pago en efectivo        
                    System.out.println("Ingrese el monto de la transferencia");
                    double montoTransferencia = sc.nextDouble();
                    pago.realizarPago(montoTransferencia);  // confirma que recibió el dinero
                    listaDePagos.add(pago);  // Graba la transacción      
                    break;
                case 4:
                    for (int i = 0; i < listaDePagos.size(); i++) {
                        Pago p = listaDePagos.get(i);
                        total += p.getMonto();
                    }
                    System.out.println("El monto total de la caja es: $" + total);
                    total = 0;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

    }

}

class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public double suma(int a, double b) {
        return a + b;
    }

    public double suma(double a, int b) {
        return a + b;
    }
}