public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.pay(100.0);

        // Paying with PayPal
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        context.pay(200.0);
    }
}
