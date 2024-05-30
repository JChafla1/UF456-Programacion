import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class InterficiesGrafiques extends Application{

    // Metodo start
    @Override
    public void start(Stage primaryStage) {
        // Crear el boton
        Button btn = new Button();
        btn.setText("Clica aquí");
        btn.setOnAction(event -> {
            // Abrir ventana emergente
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Saludos");
            alert.setHeaderText(null);
            alert.setContentText("Hola");
            alert.showAndWait();
        });

        // Crear el layout y agregar el boton
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Crear la escena con layout
        Scene scene = new Scene(root, 300, 200);

        // Configurar el escenario principal
        primaryStage.setTitle("Aplicació de Salutació");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
