package Session7;

import java.util.Map;

public class PrintBill {
    private  Map<String, Double> map;
    private  double prevTotal;
    private  double total;
    private  Customer customer;

    public PrintBill(Customer c,Map<String, Double> map, double prevTotal, double total) {
        this.customer = c;
        this.map = map;
        this.prevTotal = prevTotal;
        this.total = total;
    }


    public void first(Customer customer, Map<String, Double> map, double prevTotal, double total) {

        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
        }
        System.out.println("Your previous bill was $" + prevTotal);
        System.out.println("Your new gift balance is $" + customer.getGiftBal());
        System.out.println("Your new total comes out to $" + total);

    }

    public void second(Customer customer, Map<String, Double> map, double prevTotal, double total) {
        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
        }
        System.out.println("Your total comes out to $" + total);

    }
}
