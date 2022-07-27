import java.util.Scanner;

public class Vestibular {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int pts = 0, n = Integer.parseInt(in.nextLine());
      String g = in.nextLine();
      String c = in.nextLine();

      for (int i = 0; i < n; i++) {
         if (g.charAt(i) == c.charAt(i)) {
            pts++;
         }
      }
      System.out.println(pts);
      in.close();
   }
}