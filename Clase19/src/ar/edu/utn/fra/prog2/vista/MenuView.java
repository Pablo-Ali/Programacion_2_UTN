package ar.edu.utn.fra.prog2.vista;

import ar.edu.utn.fra.prog2.modelo.Cuenta;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class MenuView extends VBox{
    public MenuView(Stage stage, Cuenta cuenta, HashMap<String, Cuenta> cuentas){
        Label bienvenida = new Label("Bienvenido al cajero");
        Button btnSaldo = new Button("Consultar Saldo");
        Button btnDeposito = new Button("Depositar Dinero");
        Button btnExtraccion = new Button("Extraer Dinero");
        Button btnSalir = new Button("Salir");
        
        btnSaldo.setOnAction(e ->{
            Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Saldo actual: $" + cuenta.getSaldo());
            alerta.showAndWait();
        });
        
        btnDeposito.setOnAction(e -> {
            OperacionesView vista = new OperacionesView(stage, cuenta, true, cuentas);
            stage.setScene(new Scene(vista));
        });
        
        btnExtraccion.setOnAction(e -> {
            OperacionesView vista = new OperacionesView(stage, cuenta, false, cuentas);
            stage.setScene(new Scene(vista));
        });
        
        btnSalir.setOnAction(e -> {
            LoginView login = new LoginView(stage, cuentas);
            stage.setScene(new Scene(login));
        });
        
        getChildren().addAll(bienvenida, btnSaldo, btnDeposito, btnExtraccion, btnSalir);
    }
}
