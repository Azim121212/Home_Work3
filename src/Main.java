import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
       double number[] = {1.2, 3.5, -2.2, 1.7, 13.14, -33.3};
       double summa = 0;
       int col = 0;
       boolean proverka = false;
       for (double forEch:  number) {
           if (forEch < 0) {
               proverka = true;
           } else if (forEch > 0 && proverka) {
               summa+=forEch;
               col++;
               System.out.println(forEch);
           }
       }
       System.out.println(
               "Arifmetic number "  + summa/col);



       int[] arr = {8, -2, -4, 2, 3, 6};
       int min;
       for (int i = 0; i < arr.length; i++) {
           min = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[min]) {
                   min = j;
               }
           }
           if (min != i) {
               int n = arr[i];
               arr[i] = arr[min];
               arr[min] = n;
               System.out.println(Arrays.toString(arr));
    }
}
}
}