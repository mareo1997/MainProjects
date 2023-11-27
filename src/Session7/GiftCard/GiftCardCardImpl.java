package Session7.GiftCard;

import Session7.Customer;

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
    public double isRegular(Customer customer, double total) {
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

                System.out.println("Your new balance is $" + customer.getGiftBal());

                if (total < 0) {
                    total = 0;
                }

                System.out.println("Your new total comes out to $" + total);
                return total;

            } else {
                System.out.println("No gift card applied to your order.");
            }
        }
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
