import frames.RandomGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomGeneratorTest {

    @Test
    public void nameGeneratorTest() {
        RandomGenerator rg = new RandomGenerator();
        String name = rg.getName();
        int len = name.length();
        assertEquals(len, 10);
    }

    @Test
    public void surnameGeneratorTest() {
        RandomGenerator rg = new RandomGenerator();
        String name = rg.getSurname();
        int len = name.length();
        assertEquals(len, 12);
    }

    @Test
    public void phoneGeneratorTest() {
        RandomGenerator rg = new RandomGenerator();
        String name = rg.getPhone();
        int len = name.length();
        assertEquals(len, 9);
    }






}
