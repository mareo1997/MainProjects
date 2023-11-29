package Session9.Cheque;

import Session9.Customer;

import java.util.Scanner;

public class ChequeImpl implements Cheque {

    Scanner in = new Scanner(System.in);

    @Override
    public void depositCheque(Customer c) {
        System.out.println("How much is the cheque you are depositing?");
        int account = in.nextInt();
        in.nextLine();  // Consume newline left-over

//        if (account > c.getAccountBal()) {
//            System.out.println("Cant over draw account.");
//        } else {
        c.setAccountBal(c.getAccountBal() + account);
        System.out.println("You have deposited a cheque worth $" + account + ".");
        System.out.println("Current balance is $" + c.getAccountBal() + ".");
//        }
    }
}
