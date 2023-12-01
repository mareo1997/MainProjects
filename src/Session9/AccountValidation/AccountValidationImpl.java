package Session9.AccountValidation;

import Session9.Customer;

import java.util.ArrayList;

public class AccountValidationImpl implements AccountValidation {

    @Override
    public Customer validateAccount(ArrayList<Customer> customerArrayList, int account, int pin) {

        for (Customer c : customerArrayList) {
            if (c.getAccountNumber() == account && c.getPin() == pin) {
                return c;
//                break;
            }
        }


        return null;
    }
}
