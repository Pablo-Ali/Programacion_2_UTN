package ar.com.ali.prog2.persistencia;

import ar.com.ali.prog2.modelo.Vendedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author pablo
 */
public class PersistirVendedores {
    private static final String ARCHIVO = "ventas_pasajes.dat";
    
    public static void guardar(HashMap<String, Vendedor> vendedores){ 
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))){
            oos.writeObject(vendedores);
        }catch(IOException ioe){
            System.out.println("Error guardando cuenta" + ioe.getMessage());
        }
    }
    
    // Modificar para que no esté hardcodeado
    public static HashMap<String, Vendedor> cargar(){
        File archivo = new File(ARCHIVO);
        if(!archivo.exists()){
            HashMap<String, Vendedor> vendedores = new HashMap<>();
            vendedores.put("usuario1", new Vendedor("Pablo", "1234", 0));
            vendedores.put("usuario2", new Vendedor("Daniel","5678", 0));
            return vendedores;
        }
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))){
            return (HashMap<String, Vendedor>) ois.readObject();
        }catch(IOException | ClassNotFoundException ioe){
            System.out.println("Error cargando las cuentas" + ioe.getMessage());
            HashMap<String, Vendedor> vendedores = new HashMap<>();
            vendedores.put("usuario1", new Vendedor("Pablo", "1234", 0));
            vendedores.put("usuario2", new Vendedor("Daniel","5678", 0));
            return vendedores;
        }
    }
}