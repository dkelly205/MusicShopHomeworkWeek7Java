import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectrophoneTest {

    Electrophone keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Electrophone(ElectroPhoneType.ELECTRONIC_KEYBOARD, 24, "Casio", "500", "black/white", "plastic", "beep", 20.00, 50.00);
        
    }

    @Test
    public void testType() {
        assertEquals(ElectroPhoneType.ELECTRONIC_KEYBOARD, keyboard.getType());
    }

    @Test
    public void testNumberOfKeys() {
        assertEquals(24, keyboard.getNumberOfKeys());
    }
}
