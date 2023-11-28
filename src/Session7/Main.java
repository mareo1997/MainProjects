package Session7;

import Session7.GiftCard.GiftCardCardImpl;
import Session7.ProcessBill.ProcessBillImpl;
import Session7.ProcessOrder.ProcessOrderImpl;

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

                ProcessBillImpl processBillImpl = new ProcessBillImpl(menu);

                map = processBillImpl.Bill(menu, in);

            } catch (InputMismatchException e) {
                System.out.println("The information you entered is not correct please try again.");
                System.out.println();
                in.nextLine();  // Consume newline left-over
            }
            System.out.println();

            ProcessOrderImpl processOrderImpl = new ProcessOrderImpl();

            total = processOrderImpl.Order(map, in);

            System.out.println("Are you satisfied with your order?");
            response = in.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                stop = true;
            }
        }

        GiftCardCardImpl giftCard = new GiftCardCardImpl();

        giftCard.isRegular(customer, map, total);

    }
}
