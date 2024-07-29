import java.util.Scanner;

public class TaskManagementSystemTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task by ID");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter Task ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    manager.addTask(new Task(id, name, status));
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    // Search Task
                    System.out.print("Enter Task ID to search: ");
                    id = scanner.nextLine();
                    Task task = manager.searchTaskById(id);
                    if (task != null) {
                        System.out.println("Task found: " + task);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    // Display All Tasks
                    System.out.println("All Tasks:");
                    manager.displayAllTasks();
                    break;
                case 4:
                    // Delete Task
                    System.out.print("Enter Task ID to delete: ");
                    id = scanner.nextLine();
                    manager.deleteTaskById(id);
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
