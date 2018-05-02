import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
    }


    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear.eat(salmon);
        assertEquals(bear.foodCount(), 1);
        bear.sleep();
        assertEquals(bear.foodCount(), 0);
    }



}
