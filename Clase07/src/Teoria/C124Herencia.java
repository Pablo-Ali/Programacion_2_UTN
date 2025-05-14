/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class C124Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Fiat", "Strada", 2024);
        vehiculo.mostrarInformacion();
        
         
                
        
        Automovil auto = new Automovil(4, "Toyota", "Corola", 2021);
        auto.mostrarInformacion();
        
        Camion camion = new Camion(1000, "Scania", "X10", 2020);
        camion.mostrarInformacion();
    }
    
}
