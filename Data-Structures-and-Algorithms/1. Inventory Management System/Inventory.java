import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists. Use updateProduct to modify.");
        } else {
            inventory.put(product.getProductId(), product);
        }
    }

    // Update Product
    public void updateProduct(String productId, Integer quantity, Double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
        } else {
            System.out.println("Product ID not found. Use addProduct to add a new product.");
        }
    }

    // Delete Product
    public void deleteProduct(String productId) {
        if (inventory.remove(productId) == null) {
            System.out.println("Product ID not found.");
        }
    }

    // Display Inventory
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}