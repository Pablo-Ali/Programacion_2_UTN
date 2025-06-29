package ar.edu.utn.fra.prog2.vista;

import ar.edu.utn.fra.prog2.modelo.Cuenta;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class OperacionesView extends VBox{
    public OperacionesView(Stage stage, Cuenta cuenta, boolean esDeposito, HashMap<String, Cuenta> cuentas){
        Label lbl = new Label(esDeposito ? "Ingrese monto a depositar" : "Ingrese monto a extraer");
        TextField campoMonto = new TextField();
        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        Label resultado = new Label();
        
        btnAceptar.setOnAction(e -> {
            try{
                double monto = Double.parseDouble(campoMonto.getText());
                if(esDeposito){
                    cuenta.depositar(monto);
                    resultado.setText("Depósito exitoso. Nuevo Saldo $" + cuenta.getSaldo());
                }else{
                    boolean ok = cuenta.extraer(monto);
                    resultado.setText(ok ? "Extracción exitosa. Nuevo saldo $" + cuenta.getSaldo() : "No se pudo retirar. Su saldo es $" + cuenta.getSaldo());
                }
            }catch(NumberFormatException nfe){
                System.out.println("Ingrese un monto válido");
            }
            
        });
        
        btnCancelar.setOnAction(e -> {
            MenuView menu = new MenuView(stage, cuenta, cuentas);
            stage.setScene(new Scene(menu));
        });
        
        getChildren().addAll(lbl, campoMonto, btnAceptar, btnCancelar, resultado);
        
    }
}
