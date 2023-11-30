package Session10;

import Session9.AccountValidation.AccountValidationImpl;
import Session9.Customer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Customer> users = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        User u = new User(1,"mareo1997", "password", scores);
        users.add(u);

        User u1  = new User(2,"user2", "pass", scores);
        users.add(u1);

        while (true) {
            try {
                System.out.println("Welcome to banking app");
                System.out.println("Please enter your account");
                String account = in.nextLine();
                System.out.println("Please enter your pin");
                String pin = in.nextLine();
//                in.nextLine();  // Consume newline left-over
                System.out.println();

                AccountValidationImpl accountValidationImpl = new AccountValidationImpl();
                cust = accountValidationImpl.validateAccount(users, account, pin);

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



    }

}
