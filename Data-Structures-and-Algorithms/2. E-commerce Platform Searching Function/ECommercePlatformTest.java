import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommercePlatformTest {
    public static void main(String[] args) {
        List<ProductInfo> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nE-commerce Platform - Product Management");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product (Linear Search)");
            System.out.println("3. Search Product (Binary Search)");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Product
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Product Category: ");
                    String category = scanner.nextLine();
                    productList.add(new ProductInfo(productId, productName, category));
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    // Linear Search
                    System.out.print("Enter product name for linear search: ");
                    String targetName = scanner.nextLine();
                    ProductInfo result = SearchOperations.linearSearch(productList.toArray(new ProductInfo[0]), targetName);
                    if (result != null) {
                        System.out.println("Product found: " + result);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    // Binary Search
                    System.out.print("Enter product name for binary search: ");
                    targetName = scanner.nextLine();
                    ProductInfo[] productsArray = productList.toArray(new ProductInfo[0]);
                    SearchOperations.sortProducts(productsArray);
                    result = SearchOperations.binarySearch(productsArray, targetName);
                    if (result != null) {
                        System.out.println("Product found: " + result);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    // Display All Products
                    System.out.println("Product List:");
                    for (ProductInfo product : productList) {
                        System.out.println(product);
                    }
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
