package Ejercicios;

/**
 *
 * @author pablo
 * 
 *  Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
    Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
    Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
 */

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona() {
    }

    public Persona(double altura) {
        this.altura = altura;
    }
    

    public Persona(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    
    public double calcularIMC(double peso){
        return peso / (altura * altura);
    }
}
