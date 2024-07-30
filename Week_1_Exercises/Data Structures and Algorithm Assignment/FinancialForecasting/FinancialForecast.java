// FinancialForecast.java
public class FinancialForecast {

    /**
     * Recursive method to calculate future value.
     *
     * @param currentValue The current value of the investment.
     * @param growthRate The growth rate per period (as a fraction, e.g., 0.05 for 5%).
     * @param periods The number of periods to forecast.
     * @return The predicted future value.
     */
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: if no more periods, return the current value
        if (periods == 0) {
            return currentValue;
        }
        // Recursive case: calculate future value for one period less
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial investment amount
        double annualGrowthRate = 0.05;    // 5% annual growth rate
        int years = 10;                    // Number of years to forecast

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("The future value of the investment is: %.2f%n", futureValue);
    }
}
