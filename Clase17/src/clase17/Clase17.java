package clase17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Clase17 extends Application{

    public void start(Stage primaryStage) {
        Button btn = new Button("Haz click aquí");
        btn.setOnAction(e -> System.out.println("¡Hola JavaFX!"));
        
        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 300, 200);
        
        primaryStage.setTitle("Ventana JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
    
}
