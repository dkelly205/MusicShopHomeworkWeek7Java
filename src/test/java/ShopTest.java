import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;


    @Before
    public void setUp() throws Exception {
        shop = new Shop("The Music Shop");

    }

    @Test
    public void testName() {assertEquals("The Music Shop", shop.getName());
    }
}
