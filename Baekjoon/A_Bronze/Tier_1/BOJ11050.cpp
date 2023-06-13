#include <stdio.h>
#include <stdlib.h>

int fac(int a){
  if(a == 0) return 1;
  int ans =1;
  for(int i = 1; i <= a; i++){
    ans *= i;
  }
  return ans;
}

int main(){

  int A, B;
  scanf("%d %d",&A,&B);
  printf("%d",(int)(fac(A)/(fac(B)*fac(A-B))));
  
   return 0;
}