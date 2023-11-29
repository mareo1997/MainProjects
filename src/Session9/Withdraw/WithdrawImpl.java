package Session9.Withdraw;

import Session9.Customer;

import java.util.Scanner;

public class WithdrawImpl implements Withdraw {

    Scanner in = new Scanner(System.in);

    @Override
    public void withdrawCash(Customer c) {
        System.out.println("How much are you withdrawing?");
        int account = in.nextInt();
        in.nextLine();  // Consume newline left-over

        if (account > c.getAccountBal()) {
            System.out.println("Cant over draw account.");
        } else {
            c.setAccountBal(c.getAccountBal() - account);
            System.out.println("You have withdrawn $" + account + ".");
            System.out.println("Current balance is $" + c.getAccountBal() + ".");
        }
    }
}
