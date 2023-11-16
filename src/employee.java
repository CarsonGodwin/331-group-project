public class Employee {
    private String id;
    private String name;
    private double wage;
    private String position;

    // Constructor
    public Employee(String id, String name, double wage, String position) {
        this.id = id;
        this.name = name;
        this.wage = wage;
        this.position = position;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Wage: $" + wage);
        System.out.println("Position: " + position);
    }
    public double calculatePay(int hoursWorked) {
        return wage * hoursWorked;
    }
}
