package ar.com.ali.prog2.vista;

import ar.com.ali.prog2.modelo.Vendedor;
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
public class LoginView extends VBox{
    public LoginView(Stage stage, HashMap<String, Vendedor> vendedores){
        //etiquetas
        Label lblBienvenida = new Label("LOGIN");
        Label lblUser = new Label("Usuario");
        Label lblPass = new Label("Password");
        
        //campos de texto
        TextField campoUsuario = new TextField();
        PasswordField campoPin = new PasswordField();
        
        //botones
        Button btnIngresar = new Button("Ingresar");
        
        //feedback
        Label mensaje = new Label();
        
        btnIngresar.setOnAction(e -> {
            String usuario = campoUsuario.getText();
            String pin = campoPin.getText();
            Vendedor vendedor = vendedores.get(usuario);
            
            if(vendedor != null && vendedor.validarPin(usuario, pin)){
                MenuView menu = new MenuView(stage, vendedor, vendedores);
                stage.setScene(new Scene(menu)); //falta terminar el constructor para que no lance error (creo)
            }else{
                mensaje.setText("Usuario o PIN incorrecto");
            }
        });
        
        getChildren().addAll(lblBienvenida, lblUser, lblPass, campoUsuario, campoPin, btnIngresar, mensaje);
    }
}
