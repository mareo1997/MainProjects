package Session7;

import Session7.GiftCard.GiftCardCardImpl;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the GiftCard Shop");

        String response;
        Scanner in = new Scanner(System.in);
        boolean stop = false;
        double total = 0;
        Map<String, Double> map = null;

        Customer customer = new Customer("Mareo", "9543052814", "Regular", 250);

        Menu menu = new Menu();

        System.out.println(menu);
        System.out.println();

        while (!stop) {
            map = new HashMap<>();
            try {

                ProcessBill processBill = new ProcessBill(menu);

                map = processBill.Bill(menu, in);

//                System.out.println("Would you like flowers?");
//                response = in.nextLine();
//                if (response.equalsIgnoreCase("yes")) {
//                    System.out.println("How many would you like?");
//                    quantity = in.nextInt();
//                    in.nextLine();  // Consume newline left-over
//                    if (quantity > 0) {
//                        map.put("Flower(s)", quantity * menu.getFlowerAmount());
//                    }
//                }
//                System.out.println("Would you like a greeting card?");
//                response = in.nextLine();
//                if (response.equalsIgnoreCase("yes")) {
//                    System.out.println("How many would you like?");
//                    quantity = in.nextInt();
//                    in.nextLine();  // Consume newline left-over
//                    if (quantity > 0) {
//                        map.put("Greetings Card(s)", quantity * menu.getGreetingAmount());
//                    }
//                }
//                System.out.println("Would you like a photo frame?");
//                response = in.nextLine();
//                if (response.equalsIgnoreCase("yes")) {
//                    System.out.println("How many would you like?");
//                    quantity = in.nextInt();
//                    in.nextLine();  // Consume newline left-over
//                    if (quantity > 0) {
//                        map.put("Photo Frame(s)", quantity * menu.getPhotoFrameAmount());
//                    }
//                }
            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
                in.nextLine();  // Consume newline left-over
            }
            System.out.println();

            total = 0;

            ProcessOrder processOrder = new ProcessOrder(map);

            total = processOrder.Order(map, in);

//            for (Map.Entry<String, Double> me : map.entrySet()) {
//                System.out.println(me.getKey() + " \t\t$" + me.getValue());
//                total += me.getValue();
//            }
//            System.out.println("Your bill comes out to $" + total);
//            System.out.println();

            System.out.println("Are you satisfied with your order?");
            response = in.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                stop = true;
            }
        }

//        BillImpl bill = new BillImpl(customer, menu, map);

//        double total = bill.calculateBill(bill.getMenu(), bill.getMap());

//        System.out.println("Your bill comes out to $" + total);
//        System.out.println();

        GiftCardCardImpl giftCard = new GiftCardCardImpl(customer, total);

        total = giftCard.isRegular(customer, map, total);



//        PrintOrder printOrder = new PrintOrder(customer, map, total);

    }
}
