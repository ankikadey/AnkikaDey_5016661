public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the subject
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);
        
        // Deregister an observer and update stock price
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(110.00);
    }
}
