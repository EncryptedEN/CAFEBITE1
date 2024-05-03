package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

/**
 * Controls the delivery driver interface.
 * This class helps with navigation back to the staff login screen.
 *
 * @author Emmanuel Nwokoro
 * @version 1.0
 */
public class DeliveryDriverController {

    /**
     * Handles the action to go back to the staff login screen.
     * This method loads the StaffLogin.fxml scene and shows it on the current stage.
     *
     * @param event the event that triggers this method, usually a button click.
     * @throws IOException if the FXML file cannot be loaded.
     */
    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StaffLogin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
