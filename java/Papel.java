import java.util.Scanner;

public class Papel {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int c, p, f;
      c = in.nextInt();
      p = in.nextInt();
      f = in.nextInt();
      if (p / c >= f) {
         System.out.println('S');
      } else {
         System.out.println('N');

      }

   }
}
