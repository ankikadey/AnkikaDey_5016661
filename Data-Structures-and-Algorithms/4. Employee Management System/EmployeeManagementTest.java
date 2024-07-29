import java.util.Scanner;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial capacity for employee array: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        EmployeeManager manager = new EmployeeManager(capacity);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    manager.addEmployee(new Employee(id, name, position, salary));
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    // Search Employee
                    System.out.print("Enter Employee ID to search: ");
                    id = scanner.nextLine();
                    Employee employee = manager.searchEmployeeById(id);
                    if (employee != null) {
                        System.out.println("Employee found: " + employee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    // Display All Employees
                    System.out.println("All Employees:");
                    manager.displayAllEmployees();
                    break;
                case 4:
                    // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    id = scanner.nextLine();
                    manager.deleteEmployeeById(id);
                    System.out.println("Employee deleted if existed.");
                    break;
                case 5:
                    // Exit
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}