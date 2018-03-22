public class Ejercicio1 {

    public static int binarySearch(Comparable[] a, Comparable k){
        int min = 0;
        int max = a.length-1;
        int medio = (min + max)/2;

        while (min <= max){

            if (k.compareTo(a[medio]) == 0)
                return medio;

            else if (k.compareTo(a[medio]) < 0)
                max = medio -1;

            else
                min = medio +1;

            medio = (min + max)/2;
        }

        throw new RuntimeException("El valor pasado no se encuetra en el arreglo");
    }

    public static int sequentialSearch (int [] a, int k){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == (k))
                return i;
        }
        return -1;
    }
}
