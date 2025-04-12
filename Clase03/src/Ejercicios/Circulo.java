package Ejercicios;

/**
 *
 * @author pablo
 * 
 * Define una clase Círculo con un atributo radio de tipo double.
   Crea métodos para calcular el área y la circunferencia del círculo.
   Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
   porcentaje dado.
 */

public class Circulo {
    private double radio;
    private final double PI = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return PI * (radio * radio);
    }
    
    public double calcularPerimetro(){
        return 2 * PI * radio;
    }
    
    public double aumentarDisminuirRadio(boolean aumento, double porcentaje){
        double aux = porcentaje / 100;
        
        if(aumento){
            return radio + aux;
        }else{
            return radio - aux;
        }
    }
}
