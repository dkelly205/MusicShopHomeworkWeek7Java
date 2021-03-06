public class Guitar extends Instrument {
    private GuitarType type;
    private int numberOfStrings;


    public Guitar(GuitarType type, int numberOfStrings, String make, String model, String colour, String material, String sound, double tradePrice, double retailPrice) {
        super(make, model, colour, material, sound, tradePrice, retailPrice);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return this.getSound();
    }

    @Override
    public double calculateMarkUp() {
        return getRetailPrice() - getTradePrice();
    }

    public GuitarType getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
