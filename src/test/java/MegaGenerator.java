import frames.RandomGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MegaGenerator {

    @Test
    public void traficGeneratorPhoneTest() {
        for (int i = 0; i < 10; ++i) {
            RandomGenerator rg = new RandomGenerator();
            String name = rg.getPhone();
            int len = name.length();
            assertEquals(len, 9);
        }
    }

    @Test
    public void traficGeneratorNameTest() {
        for (int i = 0; i < 10; ++i) {
            RandomGenerator rg = new RandomGenerator();
            String name = rg.getName();
            int len = name.length();
            assertEquals(len, 10);
        }
    }


    @Test
    public void traficGeneratorSurnameTest(){
        for (int i = 0; i < 10; ++i) {
            RandomGenerator rg = new RandomGenerator();
            String name = rg.getSurname();
            int len = name.length();
            assertEquals(len, 12);
        }
    }
}
