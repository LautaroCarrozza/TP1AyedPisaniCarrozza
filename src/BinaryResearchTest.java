import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryResearchTest {

    @Test //(expected = RuntimeException.class)
    public void test01(){
        Comparable [] k = {1, 2, 3, 4, 5, 6};
        Comparable c = 4;
        BinaryResearch a = new BinaryResearch();
        assertEquals(3, a.binarysearch(k, c));
    }

}