import java.util.Scanner;

public class Envelopes1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int n = in.nextInt(), r = in.nextInt();

      for (int i = 1; i < n; i++) {
         int aux = in.nextInt();
         if (aux < r) {
            r = aux;
         }
      }

      System.out.println(r);
      in.close();
   }
}
