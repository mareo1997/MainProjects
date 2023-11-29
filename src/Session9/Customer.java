package Session9;

public class Customer {

    private int customerId;

    private String name;

    private String phone;

    private String email;

    private int accountNumber;

    private int accountBal;

    private int pin;

    public Customer(int customerId, String name, String phone, String email, int accountNumber, int accountBal, int pin) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.accountNumber = accountNumber;
        this.accountBal = accountBal;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBal=" + accountBal +
                ", pin=" + pin +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(int accountBal) {
        this.accountBal = accountBal;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
