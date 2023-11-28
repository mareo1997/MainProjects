package Session7;

import java.util.Map;
import java.util.Scanner;

public class ProcessOrder implements b {

    private final Map<String, Double> map;

    public ProcessOrder(Map<String, Double> map) {
        this.map = map;
    }

    @Override
    public double Order(Map<String, Double> map, Scanner in) {
        double total = 0;
        String response = "";

        for (Map.Entry<String, Double> me : map.entrySet()) {
            System.out.println(me.getKey() + "\t\t$" + me.getValue());
            total += me.getValue();
        }
        System.out.println("Your bill comes out to $" + total);
        System.out.println();

        return total;
    }
}
