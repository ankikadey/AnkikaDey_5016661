public class CCAvenueAdapter implements PaymentProcessor {
    private final CCAvenueGateway gateway;

    public CCAvenueAdapter(CCAvenueGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.process(amount);
    }
}