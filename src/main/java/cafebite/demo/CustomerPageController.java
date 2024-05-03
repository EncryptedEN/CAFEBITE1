package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

/**
 * Controls the customer pages, managing navigation and actions within the customer's interaction.
 */
public class CustomerPageController {

    /**
     * Handles navigation back to the home page.
     * <p>
     * This method responds to an event, typically a button click, signaling the application to
     * return the user to the home page of the application.
     *
     * @param event The action event that triggered this method.
     */
    @FXML
    public void handleBack(ActionEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            // Load the home page FXML
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("home.fxml")));

            Scene scene = new Scene(root);
            // Add the CSS file to the scene
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());

            // Set and show the scene on the current stage, maximizing window
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace if an IOException occurs
        }
    }

    /**
     * Placeholder method for booking a table.
     * <p>
     * Currently, this method outputs a simple message to the console indicating that the
     * Book Table button has been clicked.
     */
    @FXML
    public void bookTable() {
        System.out.println("Book Table button clicked");
    }

    /**
     * Handles navigation to the order options page.
     * <p>
     * This method triggers in response to an event (typically a button click) to navigate
     * the user to the page where they can make an order from the menu.
     *
     * @param event The action event that triggered this method.
     */
    @FXML
    public void handleMakeOrder(ActionEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("OrderOptions.fxml"))); // Ensure the path is correct
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace if an IOException occurs
        }
    }
}
