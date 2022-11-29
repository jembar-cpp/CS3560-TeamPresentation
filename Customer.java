public class Customer {
    int amount;

    public Customer() {
    }

    public void makePayment(Payment payment, int amount) {
        payment.paymentType(amount);
    }
}
