package numberFour;
import java.util.HashMap;
import java.util.Map;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentMethod eWallet= new EWallet();
        PaymentMethod cash = new Cash();
        PaymentMethod credit = new CreditCard();

        Map<String, PaymentMethod> paymentMethods = new HashMap<>();

        paymentMethods.put("ewallet", eWallet);
        paymentMethods.put("cash", cash);
        paymentMethods.put("creditcard", credit);

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethods);

        Order order1 = new Order("Order1", 1000.00, "ewallet");
        Order order2 = new Order("Order2", 6000.00, "cash");
        Order order3 = new Order("Order3", 16000.00, "creditcard");

        paymentProcessor.processPayment(order1);
        paymentProcessor.processPayment(order2);
        paymentProcessor.processPayment(order3);
    }
}