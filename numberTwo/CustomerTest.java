package numberTwo;
public class CustomerTest {
    public static void main(String[] args) {
        // Student customer
        Customer studentCustomer = new Customer("Aeron", new StudentDiscount());
        double amount = 100.0;
        double discountedAmount = studentCustomer.applyDiscount(amount);
        System.out.println("Discounted amount for " + studentCustomer.getName() + ": $" + discountedAmount);

        // Senior Citizen customer
        Customer seniorCustomer = new Customer("Lolo Aeron", new SeniorCitizenDiscount());
        discountedAmount = seniorCustomer.applyDiscount(amount);
        System.out.println("Discounted amount for " + seniorCustomer.getName() + ": $" + discountedAmount);

        // Regular customer
        Customer regularCustomer = new Customer("Red", new RegularDiscount());
        discountedAmount = regularCustomer.applyDiscount(amount);
        System.out.println("Discounted amount for " + regularCustomer.getName() + ": $" + discountedAmount);
    }
}
