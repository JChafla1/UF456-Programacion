import javafx.application.Application;

public class InterficiesGrafiques extends Application{

    // Metodo start
    @Override
    public void start(Stage primaryStage) {
        // Crear el boton
        Button btn = new Button();
        btn.setText("Clica aquí");
        btn.setOnAction(event -> {

        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
