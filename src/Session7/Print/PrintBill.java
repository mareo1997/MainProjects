package Session7.Print;

import Session7.Customer;

import java.util.Map;

public class PrintBill implements Print {

    @Override
    public void billWithGiftCard(Customer customer, Map<String, Double> map, double prevTotal, double total) {

        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
        }
        System.out.println("Your previous bill was $" + prevTotal);
        System.out.println("Your new gift balance is $" + customer.getGiftBal());
        System.out.println("Your new total comes out to $" + total);

    }

    @Override
    public void billWithNoGiftCard(Map<String, Double> map, double total) {
        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
        }
        System.out.println("Your total comes out to $" + total);

    }
}
