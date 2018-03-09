import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void setUp() throws Exception {
        accessory = new Accessory(AccessoryType.PLECTRUM, "Pickmaster", 1.00, 3.00);

    }

    @Test
    public void testAccessoryType(){
        assertEquals(AccessoryType.PLECTRUM, accessory.getType());
    }

    @Test
    public void testMake(){
        assertEquals("Pickmaster", accessory.getMake());
    }

    @Test
    public void testTradePrice(){
        assertEquals(1.00, accessory.getTradePrice(), 0.01);
    }

    @Test
    public void testRetailPrice(){
        assertEquals(3.00, accessory.getRetailPrice(), 0.01);
    }

    @Test
    public void testCalculateMarkup() {assertEquals(2.00, accessory.calculateMarkUp(), 0.01);
    }
}
