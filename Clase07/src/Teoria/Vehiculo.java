/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class Vehiculo { 
    private String marca;  //Scope en la clase que lo define, no en sus hijas
    private String modelo;
    private int anio;
    
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", año: " + anio);
    }
    
    public void encender() {
        System.out.println("El vehículo está encendido. ");
    }
    
    public void apagar() {
        System.out.println("El vehículo está apagado. ");
    }
    
}