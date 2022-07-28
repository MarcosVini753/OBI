import java.util.Scanner;

public class Vestibular {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2008/f1/vestib/
      Scanner in = new Scanner(System.in);

      int numeroQuestoes = Integer.parseInt(in.nextLine()), acertos = 0;
      String gabarito = in.nextLine();
      String questoesCandidato = in.nextLine();

      for (int i = 0; i < numeroQuestoes; i++) {

         if (gabarito.charAt(i) == questoesCandidato.charAt(i)) {
            acertos++;
         }
      }
      System.out.println(acertos);
      in.close();
   }
}
