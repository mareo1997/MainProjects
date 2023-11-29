package Session9;

public class BalanceImpl implements Balance {
    @Override
    public void viewBalance(Customer c) {
        System.out.println("Your current balance is $" + c.getAccountBal() + ".");

    }
}
