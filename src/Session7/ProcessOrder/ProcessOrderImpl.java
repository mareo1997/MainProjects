package Session7.ProcessOrder;

import java.util.Map;
import java.util.Scanner;

public class ProcessOrderImpl implements ProcessOrder {

    @Override
    public double Order(Map<String, Double> map, Scanner in) {
        double total = 0;

        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
            total += me.getValue();
        }
        System.out.println("Your bill comes out to $" + total);
        System.out.println();

        return total;
    }
}
