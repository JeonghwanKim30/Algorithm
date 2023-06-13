#include <stdio.h>
#include <stdlib.h>

int main(){

  int N ;
  
  int arrfibo[41];
  arrfibo[0] = 0;
  arrfibo[1] = 1;
  arrfibo[2] = 1;

  for(int i = 3; i<=40; i++){
    arrfibo[i] = arrfibo[i-1] + arrfibo[i-2];
  }
  scanf("%d",&N);
  printf("%d %d",arrfibo[N],N-2);
  
   return 0;
}