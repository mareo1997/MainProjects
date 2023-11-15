package Session2;

public class Menu {

    private final int vanillaAmount = 100;
    private final int chocolateAmount = 200;
    private final int mintAmount = 250;
    private final int strawberryAmount = 150;
    private int vanilla;
    private int chocolate;
    private int mint;
    private int strawberry;
    private int quantity;

    public Menu(int vanilla, int chocolate, int mint, int strawberry) {
        this.vanilla = vanilla;
        this.chocolate = chocolate;
        this.mint = mint;
        this.strawberry = strawberry;
        this.quantity = vanilla + chocolate + strawberry + mint;
    }

    public int order() {
        return (this.vanilla * vanillaAmount) + (this.chocolate * chocolateAmount) + (this.mint * mintAmount) + (this.strawberry * strawberryAmount);
    }

    @Override
    public String toString() {

        String result =
                "--------------------------------------------------------------------\n" +
                        "Sl.no\t\t  Flavour\t     Price\t Quantity\tAmount\n" +
                        "1\t\t      Vanilla\t     $100\t " + getVanilla() + "\t\t\t$" + this.vanilla * vanillaAmount + "\n" +
                        "2\t\t      Chocolate\t     $200\t " + getChocolate() + "\t\t\t$" + this.chocolate * chocolateAmount + "\n" +
                        "3\t\t      Mint\t         $250\t " + getMint() + "\t\t\t$" + this.mint * mintAmount + "\n" +
                        "4\t\t      Strawberry     $150\t " + getStrawberry() + "\t\t\t$" + this.strawberry * strawberryAmount + "\n" +
                        "---------------------------------------------------------------------\n" +
                        "Total amount is \t\t\t\t\t " + quantity + "\t\t\t$" + order();

        return result;
    }

    public int getVanilla() {
        return vanilla;
    }

    public void setVanilla(int vanilla) {
        this.vanilla = vanilla;
    }

    public int getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(int strawberry) {
        this.strawberry = strawberry;
    }

    public int getMint() {
        return mint;
    }

    public void setMint(int mint) {
        this.mint = mint;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }
}
