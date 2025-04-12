package Ejercicios;

/**
 *
 * @author pablo
 */
public class Ejercicios {
    public static void main(String args[]){
        // Ejecución ejercicios
        
        //1
        System.out.println("#####EJERCICIO 1#####");
        
        Rectangulo rec1 = new Rectangulo(2, 5);
        Rectangulo rec2 = new Rectangulo(2, 2);
        
        System.out.println(rec1.calcularArea());
        System.out.println(rec1.calcularPerimetro());
        System.out.println(rec1.esCuadrado());
        
        System.out.println(rec2.calcularArea());
        System.out.println(rec2.calcularPerimetro());
        System.out.println(rec2.esCuadrado());
        
        //2
        System.out.println("#####EJERCICIO 2#####");
        
        Circulo circ = new Circulo(10);
        
        System.out.println(circ.calcularArea());
        System.out.println(circ.calcularPerimetro());
        System.out.println(circ.aumentarDisminuirRadio(true, 20));
        System.out.println(circ.aumentarDisminuirRadio(false, 20));
        
        //3
        System.out.println("#####EJERCICIO 3#####");
        
        Persona pers1 = new Persona(18, 1.77);
        Persona pers2 = new Persona(17, 1.84);
        
        System.out.println(pers1.esMayorDeEdad());
        System.out.println(pers1.calcularIMC(97));
        System.out.println(pers2.esMayorDeEdad());
        System.out.println(pers2.calcularIMC(72));
    }
}
