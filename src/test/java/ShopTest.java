import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;


    @Before
    public void setUp() throws Exception {
        shop = new Shop("The Music Shop");
        guitar = new Guitar(GuitarType.ACOUSTIC, 6, "Fender", "CD-60S", "black", "mahogany", "twang", 20.00, 50.00 );
    }

    @Test
    public void testName() {assertEquals("The Music Shop", shop.getName());
    }

    @Test
    public void testStockStartsEmpty(){assertEquals(0, shop.stockCount());}

    @Test
    public void testCanAddProductToStock(){
        shop.addProduct(guitar);
        assertEquals(1, shop.stockCount());
    }
}
