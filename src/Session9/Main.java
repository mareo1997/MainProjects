package Session9;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer customer = new Customer(5, "Mareo Yapp", "1112223333", "mareo@gmail.com", 123456, 40000, 1234);
        customerArrayList.add(customer);
        Customer customer1 = new Customer(10, "Harry Potter", "9998887777", "potter@verse.com", 987654, 199000, 4789);
        customerArrayList.add(customer1);

        Customer cust;
        while (true) {
            try {
                System.out.println("Welcome to banking app");
                System.out.println("Please enter your account");
                int account = in.nextInt();
                System.out.println("Please enter your pin");
                int pin = in.nextInt();
                in.nextLine();  // Consume newline left-over
                System.out.println();

                AccountValidationImpl accountValidationImpl = new AccountValidationImpl();
                 cust = accountValidationImpl.validateAccount(customerArrayList, account, pin);

                if (cust == null) {
                    System.out.println("Could not find this account. Please check your number and pin again.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
                in.nextLine();  // Consume newline left-over
            }
        }
        while (true) {
            try {
                System.out.println("Welcome to your your account.");
                System.out.println("1. Withdraw Cash.");
                System.out.println("2. Deposit Cash.");
                System.out.println("3. View Balance.");
                System.out.println("4. Deposit Cheque.");
                System.out.println("5. Logout.");

                int choice = in.nextInt();
                in.nextLine();  // Consume newline left-over

                switch (choice) {
                    case 1 -> {
                        WithdrawImpl withdraw = new WithdrawImpl();
                        withdraw.withdrawCash(cust);
                    }
                    case 2 -> {
                        DepositImpl deposit = new DepositImpl();
                        deposit.depositCash(cust);
                    }
                    case 3 -> {
                        BalanceImpl balanceImpl = new BalanceImpl();
                        balanceImpl.viewBalance(cust);
                    }
                    case 4 -> {
                        ChequeImpl cheque = new ChequeImpl();
                        cheque.depositCheque(cust);
                    }
                    case 5 -> {
                        System.out.println("Logging out of your account.");
                        exit(0);
                    }
                    default -> {
                        System.out.println("That option does not exist. Try again.");
                        System.out.println();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
                in.nextLine();  // Consume newline left-over
            }
        }

    }

}

