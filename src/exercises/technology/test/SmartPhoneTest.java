package exercises.technology.test;

import exercises.technology.main.SmartPhone;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmartPhoneTest {
    @Test
    public void inheritComputer() {
        SmartPhone testPhone = new SmartPhone(12,false,true);
        String spec = "calling a computer method will run";
        testPhone.pressPowerButton();
        assertFalse(spec, testPhone.isPowered());
    }
    @Test
    public void updateIphone() {
        SmartPhone testPhone = new SmartPhone(12,false,true);
        String spec = "expect ios version to increment by 1 each time the method is called";
        int expected = 13;
        int actual = testPhone.updateIOS();
        assertEquals(spec, expected, actual);
    }
    @Test
    public void getterOverride() {
        SmartPhone testPhone = new SmartPhone(12,false,true);
        String spec = "expect getProcessor to return the correct field";
        String expected = "Apple A16 Bionic";
        String actual = testPhone.getProcessor();
        assertEquals(spec, expected, actual);
    }
}
