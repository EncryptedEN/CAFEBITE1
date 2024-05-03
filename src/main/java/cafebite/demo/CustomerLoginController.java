package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.util.Objects;

/**
 * Controller for managing customer login in the CafeBite application.
 * Handles interactions on the customer login page, including user authentication,
 * navigation to the sign-up page, and returning to the home page.
 *
 * @author Emmanuel Nwokoro
 * @version 1.0
 */
public class CustomerLoginController {
    @FXML private TextField username;
    @FXML private PasswordField password;

    /**
     * Attempts to authenticate a user based on provided credentials. If successful,
     * navigates to the main order or booking interface; otherwise, alerts the user
     * to invalid login attempts.
     *
     * @param event The event that triggered this action, typically a button press.
     * @throws IOException If an I/O error occurs during page navigation.
     */
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        if (Customer.validateLogin(username.getText(), password.getText())) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MakeOrderOrBooking.fxml"));
            Parent root = loader.load();
            MakeOrderOrBookingController controller = loader.getController();
            controller.setCurrentUser(username.getText());  // Pass the username to the next controller

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid username or password!");
            alert.showAndWait();
        }
    }

    /**
     * Navigates to the customer sign-up page in response to a button press.
     * This method facilitates user registration by loading the sign-up page.
     *
     * @param event The event that triggered this action, typically a hyperlink click.
     * @throws IOException If an I/O error occurs during page navigation.
     */
    @FXML
    private void handleSignUp(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CustomerSignUpPage.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Returns the user to the home page when the back button is pressed.
     * This method provides an escape route to the main interface from the login screen.
     *
     * @param event The event that triggered this action, typically a button press.
     * @throws IOException If an I/O error occurs during page navigation.
     */
    public void handleBack(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
