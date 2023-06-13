#include <stdio.h>
#include <stdlib.h>

void uclid(int A, int B);

int min = 0;
int main(){
    int A,B;
    scanf("%d %d",&A,&B);
    uclid(A,B);
    printf("%d\n%d",min,(int)(A*B/min));
    return 0;
}

void uclid(int A, int B){
    int temp;
    if(A < B){
        temp = A;
        A = B;
        B = temp;
    }
    
    if(A%B == 0){
        min = B;
        return;
    }
    
    
    uclid(B,A%B);
    return;
}