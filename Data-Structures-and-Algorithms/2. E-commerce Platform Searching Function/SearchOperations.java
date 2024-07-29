import java.util.Arrays;

public class SearchOperations {

    // Linear Search
    public static ProductInfo linearSearch(ProductInfo[] products, String targetProductName) {
        for (ProductInfo product : products) {
            if (product.getProductName().equalsIgnoreCase(targetProductName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static ProductInfo binarySearch(ProductInfo[] products, String targetProductName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            ProductInfo midProduct = products[mid];
            int comparison = midProduct.getProductName().compareToIgnoreCase(targetProductName);

            if (comparison == 0) {
                return midProduct;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Sort products for binary search
    public static void sortProducts(ProductInfo[] products) {
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
    }
}
