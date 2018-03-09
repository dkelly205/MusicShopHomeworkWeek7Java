public class Electrophone extends Instrument {


    public Electrophone(KeyboardType, String make, String model, String colour, String material, String sound, double tradePrice, double retailPrice) {
        super(make, model, colour, material, sound, tradePrice, retailPrice);

    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public double calculateMarkUp() {
        return 0;
    }
}
