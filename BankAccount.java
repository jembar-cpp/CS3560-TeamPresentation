public class BankAccount implements Payment {

    @Override
    public void paymentType(int amount) {
        System.out.println("Payment of $"
                + amount + " made from bank account");
    }

}
