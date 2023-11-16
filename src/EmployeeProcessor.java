import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * This class is used to process the employee data from the employees.txt file.
 */

public class EmployeeProcessor {
    public static void main(String[] args) {
        // The name of the file to open.
        String fileName = "employees.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read the file line by line.
            while ((line = reader.readLine()) != null) {
                // Split each line into parts using the comma as a separator.
                String[] parts = line.split(",");

                // Extracting individual attributes from the line.
                String id = parts[0];
                String name = parts[1];
                double wage = Double.parseDouble(parts[2]);
                String position = parts[3];
                int hoursWorked = Integer.parseInt(parts[4]);

                // Creating an Employee object with the extracted data.
                Employee employee = new Employee(id, name, wage, position);
                // Calculating the pay based on hours worked and wage.
                double pay = employee.calculatePay(hoursWorked);

                // Printing out the pay information for the employee.
                System.out.println("Pay for " + name + ": $" + pay);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Sorry an error occurred.");
        }
    }
}
