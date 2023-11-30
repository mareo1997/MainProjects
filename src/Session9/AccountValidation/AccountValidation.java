package Session9.AccountValidation;

import Session10.User;
import Session9.Customer;

import java.util.ArrayList;

public interface AccountValidation {

     User validateAccount(ArrayList<User> customerArrayList, String account, String pin);

}
