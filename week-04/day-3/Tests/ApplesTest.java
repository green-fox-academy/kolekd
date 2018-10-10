import Apples.Apples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ApplesTest {

    private Apples apples = new Apples();

    @Test
    public void testGetApple (){
        assertEquals("apple2",apples.getApple());

    }
}