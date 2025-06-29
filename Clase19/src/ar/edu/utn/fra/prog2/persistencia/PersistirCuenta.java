package ar.edu.utn.fra.prog2.persistencia;

  

import ar.edu.utn.fra.prog2.modelo.Cuenta;
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
public class PersistirCuenta {
    private static final String ARCHIVO = "cuentas.dat";
    
    public static void guardar(HashMap<String, Cuenta> cuentas){ 
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))){ // try con recursos, abre y cierra al terminar.
            oos.writeObject(cuentas); //escribe el objeto que le pasamos en el archivo
        }catch(IOException ioe){
            System.out.println("Error guardando cuenta" + ioe.getMessage());
        }
    }
    
    public static HashMap<String, Cuenta> cargar(){
        File archivo = new File(ARCHIVO); //conseguimos el path del archivo
        if(!archivo.exists()){
            HashMap<String, Cuenta> cuentas = new HashMap<>();
            cuentas.put("usuario1", new Cuenta("1234", 100000));
            cuentas.put("usuario2", new Cuenta("5678", 200000));
            return cuentas;
        }
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))){
            return (HashMap<String, Cuenta>) ois.readObject(); //casteamos para que retorne un objeto Cuenta
        }catch(IOException | ClassNotFoundException ioe){
            System.out.println("Error cargando las cuentas" + ioe.getMessage());
            HashMap<String, Cuenta> cuentas = new HashMap<>();
            cuentas.put("usuario1", new Cuenta("1234", 100000));
            cuentas.put("usuario2", new Cuenta("5678", 200000));
            return cuentas;
        }
        
    }
}
