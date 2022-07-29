import java.util.Scanner;

public class Pneu{
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2010/f1/pneu/
      Scanner in = new Scanner(System.in);

      int pressaoDesejada = in.nextInt();
      int pressaoLida = in.nextInt();

      int diferenca = pressaoDesejada - pressaoLida;

      System.out.println(diferenca);
      in.close();
   }
}
