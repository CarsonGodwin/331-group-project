import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EmployeeActionController {
    @FXML
    private void handleClockIn() {
        logTime("Clocked In");
    }

    private void logTime(String action) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("timesheet.txt", true))) {
            String timestamp = LocalDateTime.now().toString();
            writer.write("Employee ID: " + /* Employee ID */ +" - " + action + " at " + timestamp + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exceptions, possibly show an error message to the user
        }
    }

    @FXML
    private void handleClockOut() {
        logTime("Clocked Out");
    }

    // Inside your EmployeeActionController class
    @FXML
    private void handleRequestTimeOff() {
        logTime("Requested Time Off");
    }
}