package Ejercicios;

/**
 *
 * @author pablo
 * 
 * Crea una clase Rectángulo con atributos ancho y alto de tipo double.
   Implementa métodos para calcular el área y el perímetro del rectángulo.
   Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
   ancho y alto son iguales.
 */
public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
   
   public double calcularArea(){
       return ancho * alto;
   }
   
   public double calcularPerimetro(){
       return 2 * (ancho + alto);
   }
   
   public boolean esCuadrado(){
       if(ancho == alto){
           return true;
       }
       else{
           return false;
       }
   }
}