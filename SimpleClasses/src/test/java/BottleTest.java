import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void initialVolume(){
        bottle.StartVolume();
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drink(){
        bottle.StartVolume();
        bottle.drink();
        assertEquals(90,bottle.getVolume());
    }

    @Test
    public void empty(){
        bottle.StartVolume();
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fill() {
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
