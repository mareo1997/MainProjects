package Session2;

import java.util.Scanner;

public class MenuMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the Ice Cream Shop");
        System.out.println("Please pick from the menu");
        System.out.println("1. Vanilla \t\t---------- $100");
        System.out.println("2. Chocolate \t---------- $200");
        System.out.println("3. Mint \t\t---------- $250");
        System.out.println("4. Strawberry \t---------- $150");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("What quantity of Vanilla do you want?");
        int vanilla = in.nextInt();
        System.out.println("What quantity of Chocolate do you want?");
        int chocolate = in.nextInt();
        System.out.println("What quantity of Mint do you want?");
        int mint = in.nextInt();
        System.out.println("What quantity of Strawberry do you want?");
        int strawberry = in.nextInt();

        Menu menu = new Menu(vanilla, chocolate, mint, strawberry);

        System.out.println(menu);
    }

}
