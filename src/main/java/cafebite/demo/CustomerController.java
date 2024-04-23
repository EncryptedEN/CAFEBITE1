package cafebite.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.util.Objects;

public class CustomerController {

    @FXML
    public PasswordField passwordField;
   @FXML
    public TextField usernameField;
   @FXML
    public TextField firstNameField;

   @FXML
    public TextField lastNameField;

   @FXML
    public TextField emailField;

   @FXML
    public TextField addressField;

    @FXML
    private void handleLogin(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/login_customer.fxml"))));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleSignUp(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/signup_customer.fxml"))));
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleLoginAction(ActionEvent actionEvent) {
    }

    @FXML
    public void handleSignUpAction(ActionEvent actionEvent) {
    }
}
