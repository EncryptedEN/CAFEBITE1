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
 * This class manages the sign-up page for new customers in the CafeBite application.
 * It handles user interactions on the sign-up form.
 *
 * @author Emmanuel Nwokoro
 * @version 1.0
 */
public class CustomerSignUpController {
    @FXML private TextField firstName, lastName, address, username;
    @FXML private PasswordField password;

    /**
     * This method is called when a user clicks the sign-up button.
     * It attempts to register a new customer using the input from the sign-up form.
     * If registration is successful, it directs the user to the login page.
     * If registration fails, it shows an error message.
     *
     * @param event The action event triggered by clicking the sign-up button.
     * @throws IOException If there is an error during page navigation.
     */
    @FXML
    private void handleSignUp(ActionEvent event) throws IOException {
        boolean success = Customer.saveCustomer(firstName.getText(), lastName.getText(), address.getText(), username.getText(), password.getText());
        if (success) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Registration successful!");
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    try {
                        transitionToLogin(event);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to register. Please try again.");
            alert.showAndWait();
        }
    }

    /**
     * This method is called when a user clicks the "Already a member? Log in here!" link.
     * It takes the user back to the customer login page.
     *
     * @param event The action event triggered by clicking the link.
     * @throws IOException If there is an error loading the login page.
     */
    @FXML
    private void handleBackToLogin(ActionEvent event) throws IOException {
        transitionToLogin(event);
    }

    /**
     * This method handles the navigation back to the customer login page.
     * It loads the login page and shows it to the user.
     *
     * @param event The action event that initiates this navigation.
     * @throws IOException If there is an error loading the FXML file for the login page.
     */
    private void transitionToLogin(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CustomerLoginPage.fxml")));  // Ensure this matches the correct file name and path
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
