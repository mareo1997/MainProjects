package Session9.AccountValidation;

import Session9.Customer;

import java.util.ArrayList;

public interface AccountValidation {

    Customer validateAccount(ArrayList<Customer> customerArrayList, int account, int pin);

}
