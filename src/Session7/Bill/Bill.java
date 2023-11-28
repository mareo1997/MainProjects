package Session7.Bill;

import Session7.Menu;

import java.util.Map;

public interface Bill {

    double calculateBill(Menu menu, Map<String, Double> map);

}
