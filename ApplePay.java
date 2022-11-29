public class ApplePay implements Payment {

    @Override
    public void paymentType(int amount) {
        System.out.println("Payment of $"
                + amount + " made from Apple Pay");
    }

}
