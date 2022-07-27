import java.util.Scanner;

public class Telefone {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String nmr = in.nextLine();
      String nmrN = "";

      for (int i = 0; i < nmr.length(); i++) {
         if (nmr.charAt(i) > 'V') {
            nmrN += '9';
         } else if (nmr.charAt(i) > 'S') {
            nmrN += '8';
         } else if (nmr.charAt(i) > 'O') {
            nmrN += '7';
         } else if (nmr.charAt(i) > 'L') {
            nmrN += '6';
         } else if (nmr.charAt(i) > 'I') {
            nmrN += '5';
         } else if (nmr.charAt(i) > 'F') {
            nmrN += '4';
         } else if (nmr.charAt(i) > 'C') {
            nmrN += '3';
         } else if (nmr.charAt(i) == '-') {
            nmrN += nmr.charAt(i);
         } else {
            nmrN += '2';
         }
      }
      System.out.println(nmrN);
      in.close();
   }
}
