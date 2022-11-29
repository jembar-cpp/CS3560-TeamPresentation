public class Main {
    public static void main(String[] args) {

        // payment example
        Customer customer = new Customer();
        BankAccount bankAccount = new BankAccount();
        PayPal payPal = new PayPal();
        ApplePay applePay = new ApplePay();

        System.out.println();
        customer.makePayment(bankAccount, 100);

        System.out.println();
        customer.makePayment(payPal, 150);

        System.out.println();
        customer.makePayment(applePay, 200);

        System.out.println();

    }
}
