package Session10.AccountValidation;

import Session10.User;

import java.util.ArrayList;

public interface AccountValidation {

     User validateAccount(ArrayList<User> customerArrayList, String account, String pin);

}
