#include <stdio.h>

int main(){
    int A[6] = {1,1,2,2,2,8};
    int count=0;
    for(int i =0 ; i<6;i++){
        scanf("%d",&count);
        printf("%d ",A[i] - count);
    }
    
    return 0;
}