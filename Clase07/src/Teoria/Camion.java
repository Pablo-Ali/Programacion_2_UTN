/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(double capacidadCarga, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }    
}