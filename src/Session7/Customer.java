package Session7;

public class Customer {

    private String customerName;

    private String phoneNumber;

    private String customerType;

    private double giftBal;

    public Customer(String customerName, String phoneNumber, String customerType, double giftBal) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.giftBal = giftBal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getGiftBal() {
        return giftBal;
    }

    public void setGiftBal(double giftBal) {
        this.giftBal = giftBal;
    }
}
