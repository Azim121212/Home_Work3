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
               "Arifmetic number "  + summa/col
       );
    }
}