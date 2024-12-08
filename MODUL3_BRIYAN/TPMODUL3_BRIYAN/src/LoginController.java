import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void loginFunction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("briyan".equals(username) && "12345".equals(password)) {
            try {
                Parent Inventory = FXMLLoader.load(getClass().getResource("Inventory.fxml"));
                Scene inventoryControllerScene = new Scene(Inventory);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(inventoryControllerScene);
                stage.show();
            } catch (Exception e) {
                showAlert(AlertType.ERROR, "Error", "Gagal memuat tampilan Inventory.fxml.");
                e.printStackTrace();
            }
        } else {
            showAlert(AlertType.ERROR, "Login Gagal", "Silahkan cek username atau password anda!");
        }
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
