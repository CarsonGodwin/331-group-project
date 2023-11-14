import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField employeeIdField;
    private void switchToEmployeeActionScene() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeAction.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) employeeIdField.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    @FXML
    private void handleLogin() {
        String employeeId = employeeIdField.getText();
        if (isAuthenticated(employeeId)) {
            switchToEmployeeActionScene(); // Switch to the employee action scene
        } else {
            system.out.println("Invalid employee ID");
        }
    }


    private boolean isAuthenticated(String employeeId) {
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(employeeId)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions
        }
        return false;
    }
}
