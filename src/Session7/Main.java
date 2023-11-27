package Session7;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Gift Shop");

        Map<String, Integer> map = new HashMap<>();
        String response = null;
        int quantity = 0;
        Scanner in = new Scanner(System.in);

        Customer customer = new Customer("Mareo", "9543052814", "Regular", 250);

        Menu menu = new Menu();

        System.out.println(menu);
        System.out.println();

        while (true) {
            try {
                System.out.println("Would you like flowers?");
                response = in.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("How many would you like?");
                    quantity = in.nextInt();
                    in.nextLine();  // Consume newline left-over
                    if (quantity > 0) {
                        map.put("Flower(s)", quantity);
                    }
                }
                System.out.println("Would you like a greeting card?");
                response = in.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("How many would you like?");
                    quantity = in.nextInt();
                    in.nextLine();  // Consume newline left-over
                    if (quantity > 0) {
                        map.put("Greetings Card(s)", quantity);
                    }
                }
                System.out.println("Would you like a photo frame?");
                response = in.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("How many would you like?");
                    quantity = in.nextInt();
                    in.nextLine();  // Consume newline left-over
                    if (quantity > 0) {
                        map.put("Photo Frame(s)", quantity);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
                in.nextLine();  // Consume newline left-over
            }
            System.out.println();

            for (Map.Entry<String, Integer> me : map.entrySet()) {
                System.out.println(me.getValue() + " " + me.getKey());
            }
            System.out.println();

            System.out.println("Are you satisfied with your menu?");
            response = in.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        BillImpl bill = new BillImpl(customer, menu, map);

        double total = bill.calculateBill(bill.getMenu(), bill.getMap());

        System.out.println("Your bill comes out to $"+total);

    }
}
