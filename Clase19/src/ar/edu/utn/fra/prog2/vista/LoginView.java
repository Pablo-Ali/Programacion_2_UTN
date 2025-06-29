package ar.edu.utn.fra.prog2.vista;

import ar.edu.utn.fra.prog2.modelo.Cuenta;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class LoginView extends VBox{ //extender nos simplifica el tener que hacer la escena, porque ya viene incluído
    //1-crear componentes
    //2-programar los eventos
    //3-agregarlos a una escena
    
    public LoginView(Stage stage, HashMap<String, Cuenta> cuentas){
        Label lblUser = new Label("Usuario");
        TextField campoUsuario = new TextField();
        PasswordField campoPin = new PasswordField();
        Button btnIngresar = new Button("Ingresar");
        Label mensaje = new Label();
    
        btnIngresar.setOnAction(e -> {
            String usuario = campoUsuario.getText();
            String pin = campoPin.getText();
            Cuenta cuenta = cuentas.get(usuario);
            
            if(cuenta != null && cuenta.validarPin(pin)){
                MenuView menu = new MenuView(stage, cuenta, cuentas);
                stage.setScene(new Scene(menu));
            }else{
                mensaje.setText("PIN incorrecto");
            }
        });
        
        getChildren().addAll(lblUser, campoUsuario, campoPin, btnIngresar, mensaje); // se gregan en el orden en que queremos que aparezcan
    }
    
}
