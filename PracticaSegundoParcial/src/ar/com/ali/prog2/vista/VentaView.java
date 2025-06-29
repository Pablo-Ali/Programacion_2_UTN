package ar.com.ali.prog2.vista;

import ar.com.ali.prog2.modelo.Vendedor;
import java.util.HashMap;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class VentaView extends VBox{

    public VentaView(Stage stage, Vendedor vendedor, HashMap<String, Vendedor> vendedores) {
        //etiquetas
        Label lblBienvenida = new Label("VENTA DE PASAJES");
        
        //campos de texto
        TextField campoOrigen = new TextField();
        TextField campoDestino = new TextField();
        TextField campoCantidadPasajes = new TextField();
        
        //botones
        Button btnMostrarPrecio = new Button("Mostrar precio");
        Button btnVenderPasaje = new Button("Vender pasaje");
        
        btnMostrarPrecio.setOnAction(e -> {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION, "El costo del pasaje es de $250");
            alerta.showAndWait();
        });
        
        btnVenderPasaje.setOnAction(e -> {
           String origen = campoOrigen.getText();
           String destino = campoDestino.getText();
           String pasajes = campoCantidadPasajes.getText();
           int pasajesInt = Integer.parseInt(pasajes);
           // terminar la lógica
        });
        
        getChildren().addAll(lblBienvenida, campoOrigen, campoDestino, campoCantidadPasajes, btnMostrarPrecio, btnVenderPasaje);
    }
    
}
