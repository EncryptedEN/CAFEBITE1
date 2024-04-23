package cafebite.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home.fxml"))));
        primaryStage.setScene(scene);
        primaryStage.setTitle("CafeBite Home");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
