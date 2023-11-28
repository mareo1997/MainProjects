package Session7.Print;

import Session7.Customer;

import java.util.Map;

public interface Print {
     void billWithGiftCard(Customer customer, Map<String, Double> map, double prevTotal, double total);

     void billWithNoGiftCard(Map<String, Double> map, double total);
}
