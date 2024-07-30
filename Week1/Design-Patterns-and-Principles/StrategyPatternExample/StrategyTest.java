import java.util.Scanner;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                context.setPaymentStrategy(new PayPalPayment());
                break;
            default:
                System.out.println("Invalid choice. No payment strategy selected.");
                return;
        }

        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        context.executePayment(amount);

        scanner.close();
    }
}
