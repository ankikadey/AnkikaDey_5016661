public class FinancialForecast {
    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years <= 0) {
            return initialAmount;
        } else {
            return calculateFutureValue(initialAmount * (1 + growthRate), growthRate, years - 1);
        }
    }
}