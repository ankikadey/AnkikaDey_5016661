import java.util.Scanner;

public class FinancialForecastTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nFinancial Forecasting Tool");
            System.out.println("1. Calculate Future Value");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Calculate Future Value
                    System.out.print("Enter Initial Amount: ");
                    double initialAmount = scanner.nextDouble();
                    System.out.print("Enter Annual Growth Rate (as a decimal, e.g., 0.05 for 5%): ");
                    double growthRate = scanner.nextDouble();
                    System.out.print("Enter Number of Years: ");
                    int years = scanner.nextInt();
                    double futureValue = FinancialForecast.calculateFutureValue(initialAmount, growthRate, years);
                    System.out.printf("Future Value: %.2f\n", futureValue);
                    break;
                case 2:
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
