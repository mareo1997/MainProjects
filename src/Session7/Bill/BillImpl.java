package Session7.Bill;

import Session7.Customer;
import Session7.Menu;

import java.util.Map;

public class BillImpl implements Bill {

    private Customer customer;
    private Menu menu;
    private Map<String, Double> map;

    public BillImpl(Customer customer, Menu menu, Map<String, Double> map) {
        this.customer = customer;
        this.menu = menu;
        this.map = map;
    }

    @Override
    public double calculateBill(Menu menu, Map<String, Double> map) {
        double total = 0;
        for (Map.Entry<String, Double> me : map.entrySet()) {
//            System.out.println(me.getValue() + " " + me.getKey());
            if (me.getKey().equalsIgnoreCase("Flower(s)")) {
                total += me.getValue() * menu.getFlowerAmount();
            }
            if (me.getKey().equalsIgnoreCase("Greetings Card(s)")) {
                total += me.getValue() * menu.getGreetingAmount();
            }
            if (me.getKey().equalsIgnoreCase("Photo Frame(s)")) {
                total += me.getValue() * menu.getPhotoFrameAmount();
            }
        }

        return total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }
}
