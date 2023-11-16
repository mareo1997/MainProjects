package Session2;

public class Menu {

    private final int vanillaAmount = 100;
    private final int chocolateAmount = 200;
    private final int mintAmount = 250;
    private final int strawberryAmount = 150;
    int vanilla;
    int chocolate;
    int mint;
    int strawberry;
    int quantity;

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

        String result = "--------------------------------------------------------------------\n" + "Sl.no\t\t  Flavour\t     Price\t Quantity\tAmount\n";

        if(getVanilla()>0){
            result = result.concat("1\t\t      Vanilla\t     $100\t " + getVanilla() + "\t\t\t$" + getVanilla() * vanillaAmount + "\n");
        }
        if(getChocolate()>0){
            result = result.concat("2\t\t      Chocolate\t     $200\t " + getChocolate() + "\t\t\t$" + getChocolate() * chocolateAmount + "\n");
        }
        if(getMint()>0){
            result = result.concat("3\t\t      Mint\t         $250\t " + getMint() + "\t\t\t$" + getMint() * mintAmount + "\n");
        }
        if(getStrawberry()>0){
            result = result.concat("4\t\t      Strawberry     $150\t " + getStrawberry() + "\t\t\t$" + getStrawberry() * strawberryAmount + "\n");
        }

        result = result.concat("---------------------------------------------------------------------\n" + "Total amount is \t\t\t\t\t " + quantity + "\t\t\t$" + order());

        return result;
    }

    public int getVanilla() {
        return vanilla;
    }

    public int getStrawberry() {
        return strawberry;
    }

    public int getMint() {
        return mint;
    }

    public int getChocolate() {
        return chocolate;
    }

}
