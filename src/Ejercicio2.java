public class Ejercicio2 {

    /*Selection sort: Algoritmo en el cual, por cada ciclo de
    ejecución se busca colocar en la primer posicion el menor
    valor entre todos los valores que se encuentran en el
    arreglo
     */
    public <T extends Comparable> void selectionSort (T [] a){
        T min;
        int imin;

        for (int i = 0; i < a.length-1; i++) {
            min = a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++) {
                if (min.compareTo(a[j]) < 0){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin] = a[i];
            a[i] = min;
        }
    }

    //El algoritmo de insercion se basa en arrancar por el elemento que esta en la segunda posicion lo compara
    //con los elementos que esten a su izquierda y los ordena, asi hasta llegar al final.
    public <T extends Comparable>void insercion(T[] array){
        T actual;
        for (int i = 0; i < array.length ; i++) {
            actual = array[i];
            int j = i - 1;
            while ((j >= 0) && (actual.compareTo(array[j]) == -1)){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = actual;
        }
    }

    public <T extends Comparable> void burbuja(T[] array){
        T elem;
        for (int i=0; i<array.length-1; i++)
            for (int j=0; j<array.length-i-1; j++)
                if (array[j+1].compareTo(array[j]) == -1){
                    elem = array[j+1];
                    array[j+1] = array[j];
                    array[j] = elem ;
                }
    }
}
