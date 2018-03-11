import java.util.ArrayList;

public class Shop {
    
    private String name;
    private ArrayList<Product> stock;
    private ArrayList<Lesson> lessons;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addProduct(Product product) {
        stock.add(product);
    }


    public void removeProduct(Product product) {
        stock.remove(product);
    }

    public double totalPotentialProfit() {
        double total = 0;
        for(Product product : stock){
            total += product.calculateMarkUp();
        }
        return total;

    }
}
