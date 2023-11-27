package Session7;

import java.util.Map;

public class BillImpl implements Bill {

    private Customer customer;
    private Menu menu;
    private Map<String, Integer> map;

    public BillImpl(Customer customer, Menu menu, Map<String, Integer> map) {
        this.customer = customer;
        this.menu = menu;
        this.map = map;
    }

    @Override
    public double calculateBill(Menu menu, Map map) {
        return 0;
    }
}
