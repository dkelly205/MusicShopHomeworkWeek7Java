import java.util.ArrayList;

public class Shop {
    
    private String name;
    private ArrayList<Product> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
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
}
