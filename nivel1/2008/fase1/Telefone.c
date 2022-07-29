#include <stdio.h>
// https://olimpiada.ic.unicamp.br/pratique/p1/2008/f1/telefone/
int main(void){
   char telefone[20], telefoneTraduzido[20];
   scanf(" %s", telefone);
   
   for (int i = 0; i < strlen(telefone); i++){
   
      if (telefone[i] > 'V'){
         telefoneTraduzido[i] = '9';
      }
      else if (telefone[i] > 'S'){
         telefoneTraduzido[i] = '8';
      }
      else if (telefone[i] > 'O'){
         telefoneTraduzido[i] = '7';
      }
      else if (telefone[i] > 'L'){
         telefoneTraduzido[i] = '6';
      }
      else if (telefone[i] > 'I'){
         telefoneTraduzido[i] = '5';
      }
      else if (telefone[i] > 'F'){
         telefoneTraduzido[i] = '4';
      }
      else if (telefone[i] > 'C'){
         telefoneTraduzido[i] = '3';
      }
      else if (telefone[i] >= 'A'){
         telefoneTraduzido[i] = '2';
      }
      else{
         telefoneTraduzido[i] = telefone[i];
      }
      
      telefoneTraduzido[i + 1] = '\0';
   }

   printf("%s", telefoneTraduzido);
   return 0;
}
