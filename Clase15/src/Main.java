
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Menu de Usuario");
            System.out.println("1. Cargar usuarios desde archivo");
            System.out.println("2. Mostrar usuarios cargados");
            System.out.println("3. Crear usuario manualmente");
            System.out.println("4. Guardar usuarios en archivo");
            System.out.println("5. salir");
            System.out.println("Seleccione una opción");
            
            opcion = console.nextInt();
            console.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del arcchivo");
                    String nombreArchivo = console.nextLine();
                    cargarUsuarioDesdeArchivo(nombreArchivo);
                    break;
                case 2:
                    mostrarUsuarios();
                    break;
                case 3:
                    crearUsuarioManual(console);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del archivo para guardar: ");
                    String archivoDestino = console.nextLine();
                    guardarUsuariosEnArchivo(archivoDestino);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(true);
        
    }
    public static void cargarUsuarioDesdeArchivo(String archivo){
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            int lineaActual = 0;
            
            while((linea = br.readLine()) != null){
                lineaActual++;
                String[] partes = linea.split(",");
                
                if (partes.length != 4){
                    System.out.println("Linea " + lineaActual + " mal formada");
                    continue;
                }
                
                String nombre = partes[0].trim();
                String apellido = partes[1].trim();
                String email = partes[2].trim();
                int edad;
                try{
                    edad = Integer.parseInt(partes[3].trim());
                    Usuario usuario = new Usuario(nombre, apellido, email, edad);
                    usuarios.add(usuario);
                }catch (NumberFormatException e){
                    System.out.println("Edad inválida");
                }
            }
            System.out.println("Carga finalizada. Usuarios agregados: " + usuarios.size());
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado " + archivo);
        }catch (IOException e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
    
    public static void mostrarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("No hay usuarios cargados");
        }
        else{
            System.out.println("Lista de usuarios");
            for (Usuario usuario : usuarios){
                System.out.println(usuario);
            }
        }
    }
    
    public static void crearUsuarioManual(Scanner console){
        System.out.println("Crear nuevo usuario");
        
        System.out.println("Nombre: ");
        String nombre = console.nextLine().trim();
        
        System.out.println("Apellido: ");
        String apellido = console.nextLine().trim();
        
        System.out.println("Email: ");
        String email = console.nextLine().trim();
        
        System.out.println("Edad: ");
        int edad = console.nextInt();
        
        Usuario nuevoUsuario = new Usuario(nombre, apellido, email, edad);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario agregado correctamente");
    }
    
    public static void guardarUsuariosEnArchivo(String archivoDestino){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))){
            for(Usuario usuario : usuarios){
                String linea = usuario.getNombre() + "," + usuario.getApellido() + "," + usuario.getEmail() + "," + usuario.getEdad();
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Usuarios guardados en " + archivoDestino);
        }catch(IOException e){
            System.out.println("Error al guardar los datos");
        }
    }
}
