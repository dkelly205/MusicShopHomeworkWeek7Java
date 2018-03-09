public class Accessory extends Product implements Sellable {

    private String make;
    private AccessoryType type;

    public Accessory(AccessoryType type, String make, double tradePrice, double retailPrice) {
        super(tradePrice, retailPrice);
        this.type = type;
        this.make = make;
    }

    @Override
    public double calculateMarkUp() {
        return getRetailPrice() - getTradePrice();
    }

    public AccessoryType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}
