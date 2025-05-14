/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

/**
 *
 * @author pablo
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(int cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }   
}