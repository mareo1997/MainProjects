package Session7.GiftCard;

import Session7.Customer;
import Session7.PrintBill;

import java.util.Map;
import java.util.Scanner;

public class GiftCardCardImpl implements GiftCard {

    private double total;
    private Customer customer;
    private final Scanner in = new Scanner(System.in);

    @Override
    public void isRegular(Customer customer, Map<String, Double> map, double total) {
        PrintBill printBill = new PrintBill();
        if (customer.getCustomerType().equalsIgnoreCase("Regular")) {
            System.out.println("You are a regular customer do you want to use your gift card?");

            if (in.nextLine().equalsIgnoreCase("YES")) {
                double prevTotal = total;
                total -= customer.getGiftBal();

                double giftBal = customer.getGiftBal() - prevTotal;
                if (giftBal < 0) {
                    customer.setGiftBal(0);
                } else {
                    customer.setGiftBal(giftBal);
                }

                if (total < 0) {
                    total = 0;
                }

                printBill.billWithGiftCard(customer, map, prevTotal, total);

            } else {
                System.out.println("No gift card applied to your order.");
                printBill.billWithNoGiftCard(map, total);
            }
        } else {
            printBill.billWithNoGiftCard(map, total);
        }

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
