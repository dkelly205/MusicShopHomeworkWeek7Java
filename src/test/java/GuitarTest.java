import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(GuitarType.ACOUSTIC, 6, "Fender", "CD-60S", "black", "mahogany", "twang", 25.00, 50.00 );
    }

    @Test
    public void testType(){
        assertEquals(GuitarType.ACOUSTIC, guitar.getType());
    }

    @Test
    public void testNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void testMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void testModel(){
        assertEquals("CD-60S", guitar.getModel());
    }

    @Test
    public void testColour(){
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void testMaterial() {
        assertEquals("mahogany", guitar.getMaterial());
    }

    @Test
    public void testSound(){
        assertEquals("twang", guitar.getSound());
    }

    @Test
    public void testTradePrice(){
        assertEquals(25.00, guitar.getTradePrice(), 0.01);
    }

    @Test
    public void testRetailPrice(){
        assertEquals(50.00, guitar.getRetailPrice(), 0.01);
    }
}
