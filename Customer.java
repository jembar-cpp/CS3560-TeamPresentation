public class Customer {

    public Customer() {
    }

    public void makePayment(Payment payment, int amount) {
        payment.paymentType(amount);
    }
}
