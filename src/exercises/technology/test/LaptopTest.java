package exercises.technology.test;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaptopTest {
    @Test
    public void testHealthyBattery() {
        Laptop testLap = new Laptop(1,true,true);
        String spec = "the battery should report fine";
        String expected = "Battery Fine";
        String actual = testLap.batteryHealth();
        assertEquals(spec,expected,actual);
    }
    @Test
    public void testMidBattery() {
        Laptop testLap = new Laptop(10,true,true);
        String spec = "the battery should report halfway through life";
        String expected = "Your battery is over half it's life expectancy.";
        String actual = testLap.batteryHealth();
        assertEquals(spec,expected,actual);
    }
    @Test
    public void testDeadBattery() {
        Laptop testLap = new Laptop(20,true,true);
        String spec = "the battery should report hold no charge and portable become false";
        String expected = "Your battery will not hold a charge.";
        String actual = testLap.batteryHealth();
        assertEquals(spec,expected,actual);
        assertFalse(testLap.isPortable());
    }
}
