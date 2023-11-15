import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int option = -1;

        while(option != 0){
            System.out.println("Hi, my name is Juno how can I help you?");
            System.out.println("1. Laptops");
            System.out.println("2. Mobiles");
            System.out.println("3. Tablet");
            System.out.println("4. PCs");
            System.out.println("0. To exit");
            System.out.println();
            System.out.println("Pick option");
            Scanner in = new Scanner(System.in);
            option = in.nextInt();

            ArrayList<String> customer;
            if (option == 0) {
                System.out.println("Exiting chat-bot.");
            } else if (option == 1 || option == 2 || option == 3 || option == 4) {
                customer = customerInfo();

                String device;

                if(option == 1){
                    device = "Laptop";
                } else if(option == 2){
                    device = "Mobile";
                } else if(option == 3){
                    device = "Tablet";
                } else {
                    device = "PC";
                }

                System.out.println();
                System.out.println("Name: " + customer.get(0));
                System.out.println("Mobile: " + customer.get(1));
                System.out.println("Email: " + customer.get(2));
                System.out.println("Address: " + customer.get(3));
                System.out.println("Best time to contact: " + customer.get(4));
                System.out.println("Device: " + device);
                System.out.println("Customer Issue: " + customer.get(5));
                System.out.println();
                Thread.sleep(5000);

            } else {
                System.out.println("Option not available");
            }
        }
    }

    private static ArrayList<String> customerInfo() {
        ArrayList<String> customerInfo = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        customerInfo.add(in.nextLine());
        System.out.println("Enter number");
        customerInfo.add(in.nextLine());
        System.out.println("Enter email");
        customerInfo.add(in.nextLine());
        System.out.println("Enter address");
        customerInfo.add(in.nextLine());
        System.out.println("Enter best time to contact");
        customerInfo.add(in.nextLine());
        System.out.println("Enter problem occurring");
        customerInfo.add(in.nextLine());

        return customerInfo;
    }
//bala.sudhakar@snva.com
}