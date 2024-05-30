import javafx.application.Application;

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
    }

    public static void main(String[] args) {
        launch(args);
    }
}
