package numberFour;
public class Order {
    private String orderID;
    private double amount;
    private String paymentMethod;

    public Order(String orderID, double amount, String paymentMethod) {
        this.orderID = orderID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}