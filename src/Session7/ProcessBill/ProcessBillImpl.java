package Session7.ProcessBill;

import Session7.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessBillImpl implements ProcessBill {


    private Menu menu;

    public ProcessBillImpl(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public Map<String, Double> Bill(Menu menu, Scanner in) {

        Map<String, Double> map = new HashMap<>();

        String response;

        int quantity;

        System.out.println("Would you like flowers?");
        response = in.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("How many would you like?");
            quantity = in.nextInt();
            in.nextLine();  // Consume newline left-over
            if (quantity > 0) {
                map.put("Flower(s)", quantity * menu.getFlowerAmount());
            }
        }
        System.out.println("Would you like a greeting card?");
        response = in.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("How many would you like?");
            quantity = in.nextInt();
            in.nextLine();  // Consume newline left-over
            if (quantity > 0) {
                map.put("Greetings Card(s)", quantity * menu.getGreetingAmount());
            }
        }
        System.out.println("Would you like a photo frame?");
        response = in.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("How many would you like?");
            quantity = in.nextInt();
            in.nextLine();  // Consume newline left-over
            if (quantity > 0) {
                map.put("Photo Frame(s)", quantity * menu.getPhotoFrameAmount());
            }
        }

        return map;
    }

}
