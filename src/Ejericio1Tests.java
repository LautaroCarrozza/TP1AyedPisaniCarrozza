import org.junit.Test;

import static org.junit.Assert.*;

public class Ejericio1Tests {

    @Test (expected = RuntimeException.class)
    public void test01(){
        Comparable [] k = {1, 2, 3, 4, 5, 6};
        Comparable c = 7;
        Ejercicio1 a = new Ejercicio1();
        a.binarySearch(k, c);
    }

    @Test
    public void test02(){
        assertEquals(3, Ejercicio1.binarySearch(new Comparable [] {1, 2, 3, 4, 5, 6}, 4));
    }

    @Test
    public void testDeBusquedaSecuencial(){
        assertEquals(3, new Ejercicio1().sequentialSearch(new int[]{1,2,3,4,5,6}, 4));
    }

}