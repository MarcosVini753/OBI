import java.util.Scanner;

public class Envelopes1 {
   public static void main(String[] args) {
      // https://olimpiada.ic.unicamp.br/pratique/pj/2009/f1/envelopes1/
      Scanner in = new Scanner(System.in);

      int tiposEnvelope = in.nextInt();
      // devemos imprimir o menor número dentre os digitados
      // pois este representa a quantidade de rotulos que podemos trocar
      int menor = in.nextInt();
      // consideramos a primeira quantidade de rotulos digitada como a menor

      for (int i = 1; i < tiposEnvelope; i++) {

         int qntRotulo = in.nextInt();
         // procuramos um rotulo que esteja em uma quantidade menor
         // do que a anterior e guardamos essa quantidade
         if (qntRotulo < menor) {
            menor = qntRotulo;
         }
      }

      System.out.println(menor);
      in.close();
   }
}
