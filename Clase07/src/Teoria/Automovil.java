/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class Automovil extends Vehiculo {
    private int cantidadPuertas;
    
    /**
     * super(...) debe ser la primer instrucción dentro del constructor de la subclase
     * Dentro de los paréntesis  (...) hay que pasar los "argumentos necesarios" que espera el constructor de su superclase
     * "Vehiculo vos que sos mi superclase primero inicialicemos marca, modelo y año, luego yo Coche agrego mis propias particularidades
     */
    public Automovil(int cantidadPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);  // Ejecuta el constructuro de su superclase
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(", cantidad de Puertas: " + cantidadPuertas);
    }
    
}
