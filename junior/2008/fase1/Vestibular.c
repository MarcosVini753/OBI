#include <stdio.h>
#include <string.h>

int main(void)
{
   int numeroQuestoes, pontos = 0;
   scanf("%d", &numeroQuestoes);

   char gabarito[82], candidato[82];
   scanf(" %s %s", gabarito, candidato);

   for (int i = 0; i < numeroQuestoes; i++)
   {
      if (gabarito[i] == candidato[i])
      {
         pontos++;
      }
   }

   printf("%d", pontos);
   return 0;
}
