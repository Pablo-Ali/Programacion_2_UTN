package Teoria;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TestTelevisor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor tv = new Televisor("Sony", "AR50", "Negro", 50);
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean enchufado = true;
        int canal;

        while (enchufado) {
            System.out.println("\n======= MENU DEL TELEVIVOR ==========");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Subir Volumen");
            System.out.println("4. Bajar Volumen");
            System.out.println("5. Mute");
            System.out.println("6. Subir Canal");
            System.out.println("7. Bajar Canal");
            System.out.println("8. Cambiar Canal");
            System.out.println("9. Mostrar Estado");
            System.out.println("0. Salir");
            System.out.println("Seleccione la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    tv.encender();
                    break;
                case 2:
                    tv.apagar();
                    break;
                case 3:
                    tv.subirVolumen();
                    break;
                case 4:
                    tv.bajarVolumen();
                    break;
                case 5:
                    tv.mute();
                    break;
                case 6:
                    tv.subirCanal();
                    break;
                case 7:
                    tv.bajarCanal();
                    break;
                case 8:
                    System.out.println("Ingrese el canal deseado: ");
                    canal = sc.nextInt();
                    tv.cambiarCanal(canal);
                    break;
                case 9:
                    tv.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Apagando el televisor. Hasta luego");
                    enchufado = false;
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        }    
        sc.close();
    }
}
