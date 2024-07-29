public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display(); // Loads and displays
        image1.display(); // Only displays (cached)
        image2.display(); // Loads and displays
    }
}
