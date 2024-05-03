package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Objects;

/**
 * Handles navigation for the chef interface within
 * the CafeBite application.
 * This controller provides
 * functionality for the chef to return to the staff login screen.
 *
 * @author Emmanuel Nwokoro
 * @version 1.0
 */
public class ChefController {

    /**
     * Handles the action triggered by pressing
     * the back button on the chef's interface.
     * This method loads and displays the staff login screen,
     * allowing the chef to exit their current session.
     *
     * @param event The event that triggered this action, typically a button press.
     * @throws IOException If the FXML file cannot be loaded, indicating a file path or access issue.
     */
    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StaffLogin.fxml")));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
