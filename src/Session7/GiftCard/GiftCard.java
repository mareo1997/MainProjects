package Session7.GiftCard;

import Session7.Customer;

import java.util.Map;

public interface GiftCard {

    double isRegular(Customer customer, Map<String, Double> map, double total);

}
