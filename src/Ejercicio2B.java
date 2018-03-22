public class Ejercicio2B {

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
}
