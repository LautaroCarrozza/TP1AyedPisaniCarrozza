public class Ejercicio2 {

    /*Selection sort: Algoritmo en el cual, por cada ciclo de
    ejecución se busca colocar en la primer posicion el menor
    valor entre todos los valores que se encuentran en el
    arreglo
     */
    public static <T extends Comparable> void selectionSort (T [] a){
        T min;
        int imin;

        for (int i = 0; i < a.length - 1; i++) {
            min = a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++) {
                if (min.compareTo( a[j]) > 0){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin] = a[i];
            a[i] = min;
        }
    }

    /*El algoritmo de insercion se basa en arrancar por el elemento
    que esta en la segunda posicion lo compara con los elementos que
    esten a su izquierda y los ordena, asi hasta llegar al final.
    */
    public static <T extends Comparable> void insercion(T[] array){
        T actual;
        for (int i = 0; i < array.length ; i++) {
            actual = array[i];
            int j = i - 1;
            while ((j >= 0) && (actual.compareTo(array[j]) < 0)){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    public static <T extends Comparable> void burbuja(T[] array){
        T elem;
        for (int i=0; i<array.length-1; i++)
            for (int j=0; j<array.length-i-1; j++)
                if (array[j+1].compareTo(array[j]) < 0){
                    elem = array[j+1];
                    array[j+1] = array[j];
                    array[j] = elem;
                }
    }

    public static void selectionSortRecur (int [] a){

        selectionSortRecursivoPaso2(a, 0);
    }

    private static int[] selectionSortRecursivoPaso2(int [] a, int n) {
        int posicionMin = selectionSortRecurPaso3(a, n, n);
        int cambio = a[n];
        a[n] = a[posicionMin];
        a [posicionMin] = cambio;
        if (n != a.length-1)
        selectionSortRecursivoPaso2(a, n+1);
        return a;
    }

    private static int selectionSortRecurPaso3(int[] a, int n, int posicionMinimo) {
        if (n != a.length-1){

            if (a[posicionMinimo] > a[n+1])
            posicionMinimo = n+1;

            posicionMinimo = selectionSortRecurPaso3(a, n+1, posicionMinimo);
        }
        return posicionMinimo;
    }

}
