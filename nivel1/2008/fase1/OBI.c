#include <stdio.h>
// https://olimpiada.ic.unicamp.br/pratique/p1/2008/f1/obi/
int main(void)
{
   int numeroCompetidores, pontosMinimos, competidoresConvidados = 0;
   scanf("%d %d", &numeroCompetidores, &pontosMinimos);
   for (int i = 0; i < numeroCompetidores; i++)
   {
      int ponto1, ponto2;
      scanf("%d %d", &ponto1, &ponto2);
      if (ponto1 + ponto2 >= pontosMinimos)
      {
         competidoresConvidados++;
      }
   }
   printf("%d", competidoresConvidados);
   return 0;
}