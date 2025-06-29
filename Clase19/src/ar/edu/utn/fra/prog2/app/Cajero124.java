package ar.edu.utn.fra.prog2.app;

import ar.edu.utn.fra.prog2.modelo.Cuenta;
import ar.edu.utn.fra.prog2.persistencia.PersistirCuenta;
import ar.edu.utn.fra.prog2.vista.LoginView;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class Cajero124 extends Application{   

    @Override
    public void start(Stage stage) throws Exception {
        HashMap<String, Cuenta> cuentas = PersistirCuenta.cargar();
        
        LoginView login = new LoginView(stage, cuentas); //creamos la ventana
        stage.setScene(new Scene(login)); //creamos la escena
        stage.setTitle("Cajero - Inicio de sesión"); //ponemos título a la escena
        
        stage.setOnCloseRequest(eh -> PersistirCuenta.guardar(cuentas)); //guarda el estado al salir
        
        stage.show(); //lo mostramos
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
