package Session7;

public class Menu {

    private final double flowerAmount = 20;
    private final double greetingAmount = 30;
    private final double photoFrameAmount = 100;

    @Override
    public String toString() {

        String result = "Item Name\tPrice\n"
                +"Flowers\t\t$"+flowerAmount+"\n"
                +"Photo Frame\t$"+photoFrameAmount+"\n"
                +"Greeting\t$"+greetingAmount+"\n"
                +"Card"
                ;

        return result;
    }
}
