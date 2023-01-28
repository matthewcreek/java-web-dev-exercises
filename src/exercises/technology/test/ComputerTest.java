package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {
    Computer testComp;
    @Before
    public void buildComp() {
        testComp = new Computer(true,false);
    }

    @Test
    public void verifyPower() {
        assertFalse(testComp.isPowered());
    }
    @Test
    public void powerButtonWorks() {
        String spec = "power button method will invert current isPowered boolean";
        assertFalse(spec, testComp.isPowered());
        testComp.pressPowerButton();
        assertTrue(spec, testComp.isPowered());

    }
    @Test
    public void checkCheckOn() {
        String spec = "the check if on method will return the current state of isPowered";
        String expected = "Device is not turned on.";
        String actual = testComp.checkIfOn();
        assertEquals(spec, expected, actual);


    }
}
