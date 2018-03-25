import org.junit.Test;
import java.util.Arrays;
public class Ejercicio2Test {

    @Test
    public void sortingTests (){
        Integer [] a = {1, 3, 5, 2, 4};
        Integer [] b = {1, 3, 5, 2, 4};
        Integer [] c = {1, 3, 5, 2, 4};

        Ejercicio2.selectionSort(a);
        System.out.println(Arrays.asList(a));

        Ejercicio2.selectionSort(b);
        System.out.println(Arrays.asList(b));

        Ejercicio2.selectionSort(c);
        System.out.println(Arrays.asList(c));
    }

    @Test
    public void selectionRecursivo(){
        int [] a = {1, 3, 5, 4, 2};

        Ejercicio2.selectionSortRecur(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}