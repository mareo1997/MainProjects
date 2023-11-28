package Session7.GiftCard;

import Session7.Customer;
import Session7.PrintBill;

import java.util.Map;
import java.util.Scanner;

public class GiftCardCardImpl implements GiftCard {

    private double total;
    private Customer customer;
    private final Scanner in = new Scanner(System.in);

    public GiftCardCardImpl(Customer customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    @Override
    public double isRegular(Customer customer, Map<String, Double> map, double total) {
        double prevTotal = 0;
        PrintBill printBill = new PrintBill(customer, map, prevTotal, total);
        if (customer.getCustomerType().equalsIgnoreCase("Regular")) {
            System.out.println("You are a regular customer do you want to use your gift card?");

            if (in.nextLine().equalsIgnoreCase("YES")) {
                prevTotal = total;
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

                printBill.first(customer, map, prevTotal, total);
                return total;

            } else {
                System.out.println("No gift card applied to your order.");
            }
        }
        printBill.second(customer, map, prevTotal, total);

        return total;
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
