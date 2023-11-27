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
    public double calculateBill(Menu menu, Map<String, Integer> map) {
        double total = 0;
        for (Map.Entry<String, Integer> me : map.entrySet()) {
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

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}
