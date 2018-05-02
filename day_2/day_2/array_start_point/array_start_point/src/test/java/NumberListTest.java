import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {
    private NumberList myNumbers;

    @Before
    public void before(){
//        myNumbers = new NumberList();
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1); // NEW
        testNumbers.add(2); // NEW
        testNumbers.add(3); // NEW
        testNumbers.add(4); // NEW
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList(){
        myNumbers.addNumber(12);
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
//        myNumbers.addNumber(12);
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
//        myNumbers.addNumber(1);
//        myNumbers.addNumber(2);
//        myNumbers.addNumber(3);
//        myNumbers.addNumber(4);
        assertEquals(10, myNumbers.getTotal());
    }



}
