package Session7;

public class Menu {

    private final double flowerAmount = 20;
    private final double greetingAmount = 30;
    private final double photoFrameAmount = 100;

    @Override
    public String toString() {

        return "Item Name\tPrice\n"
                + "Flowers\t\t$" + flowerAmount + "\n"
                + "Photo Frame\t$" + photoFrameAmount + "\n"
                + "Greeting\t$" + greetingAmount + "\n"
                + "Card";
    }

    public double getFlowerAmount() {
        return flowerAmount;
    }

    public double getGreetingAmount() {
        return greetingAmount;
    }

    public double getPhotoFrameAmount() {
        return photoFrameAmount;
    }
}
