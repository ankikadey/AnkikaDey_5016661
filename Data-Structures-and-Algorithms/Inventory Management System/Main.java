import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventorySystem = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    inventorySystem.addProduct(new Product(productId, productName, quantity, price));
                    break;
                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    productId = scanner.nextLine();
                    System.out.print("Enter new Quantity (or -1 to skip): ");
                    quantity = scanner.nextInt();
                    Integer newQuantity = (quantity >= 0) ? quantity : null;
                    System.out.print("Enter new Price (or -1 to skip): ");
                    price = scanner.nextDouble();
                    Double newPrice = (price >= 0) ? price : null;
                    inventorySystem.updateProduct(productId, newQuantity, newPrice);
                    break;
                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    productId = scanner.nextLine();
                    inventorySystem.deleteProduct(productId);
                    break;
                case 4:
                    inventorySystem.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
