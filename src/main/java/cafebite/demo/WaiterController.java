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
 * Controls the actions of the waiter interface.
 *
 * @author Emmanuel Nwokoro
 * @version 1.0
 */
public class WaiterController {

    /**
     * Handles the action of navigating back from the waiter interface to the staff login page.
     *
     * @param event the ActionEvent triggered when the "Back" button is clicked
     * @throws IOException if an I/O error occurs while loading the FXML file or setting the scene
     */
    @FXML
    public void handleBack(ActionEvent event) throws IOException {

        // Load the FXML file for the staff login page
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StaffLoginPage.fxml"));
        Parent root = loader.load();

        // Create a new scene with the loaded root and add stylesheet
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());

        // Get the stage from the event source, set the scene, maximize, and show
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
