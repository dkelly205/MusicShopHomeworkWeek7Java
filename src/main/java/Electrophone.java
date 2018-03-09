import java.lang.annotation.ElementType;

public class Electrophone extends Instrument {

    private ElectroPhoneType type;
    private int numberOfKeys;

    public Electrophone(ElectroPhoneType type, int numberOfKeys, String make, String model, String colour, String material, String sound, double tradePrice, double retailPrice) {
        super(make, model, colour, material, sound, tradePrice, retailPrice);
        this.type = type;
        this.numberOfKeys = numberOfKeys;

    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public double calculateMarkUp() {
        return 0;
    }

    public ElectroPhoneType getType() {
        return type;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
