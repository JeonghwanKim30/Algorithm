#include <stdio.h>
#include <stdlib.h>

void uclid(int A, int B);

int min = 0;
int main(){
  int T;
  scanf("%d",&T);
  int A = 0;
  int B = 0;
  for(int test_case = 0 ; test_case < T; test_case++){
    scanf("%d %d",&A,&B);
    uclid(A,B);
    printf("%d\n",(int)(A*B/min));
  }
   return 0;
}

void uclid(int A, int B){
  int temp = 0;
  if (A < B){
    temp = A;
    A = B;
    B = temp;
  }

  if(A%B==0){
    min = B;
    return;
  }
  uclid(B,A%B);
  return;
}