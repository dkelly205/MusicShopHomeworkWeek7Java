public abstract class Product implements Sellable {

    private double tradePrice;
    private double retailPrice;

    public Product(double tradePrice, double retailPrice) {
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
