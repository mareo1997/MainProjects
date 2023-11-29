package Session9.Deposit;

import Session9.Customer;

import java.util.Scanner;

public class DepositImpl implements Deposit {

    Scanner in = new Scanner(System.in);

    @Override
    public void depositCash(Customer c) {
        System.out.println("How much are you depositing?");
        int account = in.nextInt();
        in.nextLine();  // Consume newline left-over

//        if (account > c.getAccountBal()) {
//            System.out.println("Cant over draw account.");
//        } else {
        c.setAccountBal(c.getAccountBal() + account);
        System.out.println("You have deposited $" + account + ".");
        System.out.println("Current balance is $" + c.getAccountBal() + ".");
//        }
    }
}
