public abstract class Instrument extends Product implements Playable{

    private String make;
    private String model;
    private String colour;
    private String material;
    private String sound;


    public Instrument(String make, String model, String colour, String material, String sound, double tradePrice, double retailPrice) {
        super(tradePrice, retailPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.sound = sound;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getSound() {
        return sound;
    }
}
