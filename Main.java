public class Main {
    public static void main(String[] args) {

        // payment example
        Customer customer = new Customer();
        BankAccount bankAccount = new BankAccount();
        PayPal payPal = new PayPal();
        ApplePay applePay = new ApplePay();

        customer.makePayment(bankAccount, 100);
        customer.makePayment(payPal, 150);
        customer.makePayment(applePay, 200);

    }
}
