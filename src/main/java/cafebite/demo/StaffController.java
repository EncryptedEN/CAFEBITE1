package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import java.util.Objects;

public class StaffController {

    @FXML
    private void handleLogin(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login_staff.fxml"))));
        stage.setScene(scene);
        stage.show();
    }
}
