import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nE-commerce Platform - Order Management");
            System.out.println("1. Add Order");
            System.out.println("2. Sort Orders by Bubble Sort");
            System.out.println("3. Sort Orders by Quick Sort");
            System.out.println("4. Display All Orders");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Order
                    System.out.print("Enter Order ID: ");
                    String orderId = scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Total Price: ");
                    double totalPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    orderList.add(new Order(orderId, customerName, totalPrice));
                    System.out.println("Order added successfully.");
                    break;
                case 2:
                    // Bubble Sort
                    Order[] bubbleSortedOrders = orderList.toArray(new Order[0]);
                    SortOrders.bubbleSort(bubbleSortedOrders);
                    System.out.println("\nOrders sorted by Bubble Sort:");
                    printOrders(bubbleSortedOrders);
                    break;
                case 3:
                    // Quick Sort
                    Order[] quickSortedOrders = orderList.toArray(new Order[0]);
                    SortOrders.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
                    System.out.println("\nOrders sorted by Quick Sort:");
                    printOrders(quickSortedOrders);
                    break;
                case 4:
                    // Display All Orders
                    System.out.println("\nAll Orders:");
                    printOrders(orderList.toArray(new Order[0]));
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

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
