package Session9.AccountValidation;

import Session10.User;
import Session9.Customer;

import java.util.ArrayList;

public class AccountValidationImpl implements AccountValidation {

    @Override
    public User validateAccount(ArrayList<User> customerArrayList, String account, String pin) {
        for (User c : customerArrayList) {
            if (c.getUsername().equalsIgnoreCase( account )&& c.getPassword().equals(pin)) {
                return c;
            }
        }
        return null;
    }
}
