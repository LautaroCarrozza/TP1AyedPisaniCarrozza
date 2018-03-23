public class Ejercicio3 {

    public static <T extends Comparable> T[] ejercicio3(T[] a, T[] b){

        int i = 0, j = 0, k = 0;

        T[] resultado = (T[]) new Comparable[a.length + b.length];

        while(i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) < 0) {
                resultado[k] = a[i];
                i++;
                k++;
            } else {
                resultado[k] = b[j];
                k++;
                j++;
            }
        }
        while (j<b.length){
            resultado[k] = b[j];
            j++; k++;
        }

        while(i<a.length){
            resultado[k] = a[i];
            i++; k++;
        }
        return resultado;
    }


}
