package Session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println("Welcome to the Ice Cream Shop");
            System.out.println("Please pick from the menu");
            System.out.println("1. Vanilla \t\t---------- $100");
            System.out.println("2. Chocolate \t---------- $200");
            System.out.println("3. Mint \t\t---------- $250");
            System.out.println("4. Strawberry \t---------- $150");
            System.out.println();

            int vanilla = 0;
            int chocolate = 0;
            int mint = 0;
            int strawberry = 0;

            try {
                Scanner in = new Scanner(System.in);
                System.out.println("What quantity of Vanilla do you want?");
                vanilla = in.nextInt();
                System.out.println("What quantity of Chocolate do you want?");
                chocolate = in.nextInt();
                System.out.println("What quantity of Mint do you want?");
                mint = in.nextInt();
                System.out.println("What quantity of Strawberry do you want?");
                strawberry = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("This is not a correct number. Please try again.");
                System.out.println();
                continue;
            }

            Menu menu = new Menu(vanilla, chocolate, mint, strawberry);

            System.out.println(menu);
            System.out.println();
            Thread.sleep(4000);
        }


    }

}
