import java.util.Scanner;

public class Papel {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2009/f1/papel/
      Scanner in = new Scanner(System.in);

      int competidores = in.nextInt();
      int papelComprado = in.nextInt();
      int folhasPorCompetidoor = in.nextInt();

      if (papelComprado / competidores >= folhasPorCompetidoor) {
         System.out.println('S');
      } else {
         System.out.println('N');
      }

      in.close();
   }
}
