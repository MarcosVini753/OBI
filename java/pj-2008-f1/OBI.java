import java.util.Scanner;

public class OBI {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int n, p, x, y, cnt = 0;
      n = in.nextInt();
      p = in.nextInt();

      for (int i = 0; i < n; i++) {
         x = in.nextInt();
         y = in.nextInt();
         if (x + y >= p) {
            cnt++;
         }
      }
      System.out.println(cnt);

      in.close();
   }
}