import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Controller {
    @FXML
    private TextField employeeIdField;

    @FXML
    private Button clockInButton;

    @FXML
    private Button clockOutButton;

    @FXML
    private void handleClockIn() {
        String id = employeeIdField.getText();
        logTime(id, "Clocked in");
    }

    @FXML
    private void handleClockOut() {
        String id = employeeIdField.getText();
        logTime(id, "Clocked out");
    }

    private void logTime(String id, String action) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("timesheet.txt", true))) {
            writer.write(id + " " + action + " at " + getCurrentTimestamp() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getCurrentTimestamp() {
        return LocalDateTime.now().toString();
    }
}

