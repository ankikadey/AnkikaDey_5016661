// TestAdapterPattern.java
public class TestAdapter {
    public static void main(String[] args) {
        // Create instances of the gateway classes
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        PaymentProcessor paytm = new PaytmAdapter(new PaytmGateway());
        PaymentProcessor ccaVenue = new CCAvenueAdapter(new CCAvenueGateway());

        // Process payments using different gateways through adapters
        System.out.println("Testing Razorpay Adapter:");
        razorpay.processPayment(5000.00);

        System.out.println("\nTesting Paytm Adapter:");
        paytm.processPayment(2500.00);

        System.out.println("\nTesting CCAvenue Adapter:");
        ccaVenue.processPayment(7500.00);
    }
}
