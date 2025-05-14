package Teoria;

/**
 *
 * @author pablo
 */
import java.util.Scanner;

public class AppControlTv {
    public static void main(String[] args) {
        Televisor tv = new Televisor("Sony", "AR50", "negro", 50);
        ControlRemoto control = new ControlRemoto(tv);
        Scanner sc = new Scanner(System.in);
        int opcion;
               
        do {
            System.out.println("\n----------- Control Remoto ---");
            System.out.println("1. Encender/Apagar Tv");
            System.out.println("2. Mostrar info");
            System.out.println("3. Subir Volumen");
            System.out.println("4. Bajar Volumen");
            System.out.println("5. Subir Canal");
            System.out.println("6. Bajar Canal");
            System.out.println("7. Cambiar Canal");
            System.out.println("8. Mute");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    control.presionarBotonEncendido();
                    break;
                case 2:
                    control.presionarBotonInfo();
                    break;
                case 3:
                    control.presionarBotonSubirVolumen();
                    break;
                case 4:
                    control.presionarBotonBajarVolumen();
                    break;
                case 5:
                    control.presionarBotonSubirCanal();
                    break;
                case 6:
                    control.presionarBotonBajarCanal();
                    break;
                case 7:
                    System.out.println("Ingrese el canal: ");
                    int canal = sc.nextInt();
                    control.presionarBotonCambiarCanal(canal);
                    break;
                case 8:
                    control.presionarBotonMute();
                    break;                    
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;            
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
        
        sc.close();
       

    }
}