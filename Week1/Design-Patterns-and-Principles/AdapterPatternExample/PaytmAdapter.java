public class PaytmAdapter implements PaymentProcessor {
    private final PaytmGateway gateway;

    public PaytmAdapter(PaytmGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.pay(amount);
    }
}