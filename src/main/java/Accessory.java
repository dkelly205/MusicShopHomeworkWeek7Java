public class Accessory extends Product {

    private String make;
    private AccessoryType type;

    public Accessory(AccessoryType type, String make, double tradePrice, double retailPrice) {
        super(tradePrice, retailPrice);
        this.type = type;
        this.make = make;
    }

    @Override
    public double calculateMarkUp() {
        return 0;
    }

    public AccessoryType getType() {
        return type;
    }
}
