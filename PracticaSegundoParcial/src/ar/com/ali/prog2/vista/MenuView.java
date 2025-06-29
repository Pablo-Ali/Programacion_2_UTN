package ar.com.ali.prog2.vista;

import ar.com.ali.prog2.modelo.Vendedor;
import java.util.HashMap;
import javafx.scene.Scene;
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
public class MenuView extends VBox{
    public MenuView(Stage stage, Vendedor vendedor, HashMap<String, Vendedor> vendedores){
        // origen, destino, pasaje
        // mostrar precio
        // actualizar ventas totales del vendedor (vender pasaje)
        //consultar los pasajes totales vendidos por el usuario
        //cerrar sesión
        
        
        //etiquetas
        Label lblBienvenida = new Label("MENÚ");
        
        //botones
        Button btnVenderPasaje = new Button("Vender pasaje");
        Button btnConsultarVentas = new Button("Consultar pasajes vendidos");
        Button btnSalir = new Button("Salir");
           
        
        btnVenderPasaje.setOnAction(e -> {
           VentaView ventanaVentas = new VentaView(stage,vendedor, vendedores);
           stage.setScene(new Scene(ventanaVentas));
        });
        
        btnConsultarVentas.setOnAction(e ->{
            Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Pasajes vendidos: " + vendedor.getVentas());
            alerta.showAndWait();
        });
        
        btnSalir.setOnAction(e -> {
            LoginView login = new LoginView(stage, vendedores);
            stage.setScene(new Scene(login));
        });
        
        getChildren().addAll(lblBienvenida, btnVenderPasaje, btnConsultarVentas, btnSalir);
    }
}
