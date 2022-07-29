#include <stdio.h>
// https://olimpiada.ic.unicamp.br/pratique/p1/2008/f1/insens/
int main(void){
   int QuantidadeObjetos, insensibilidade = 0;
   scanf("%d", &QuantidadeObjetos);

   for (int i = 0; i < QuantidadeObjetos; i++){
     
      int x1, y1, x2, y2, distancia;
      scanf("%d %d %d %d", &x1, &y1, &x2, &y2);

      distancia = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
      insensibilidade += distancia;
   }

   printf("%d", insensibilidade);
   return 0;
}
