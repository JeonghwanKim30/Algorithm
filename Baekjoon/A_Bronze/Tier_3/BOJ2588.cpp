#include <stdio.h>

int main(){
    int answer = 0;
    int A = 0;
    int B = 0;
    int BB[3] = {0};
    int result[4] = {0};
    scanf("%d",&A);
    scanf("%d",&B);
    
    for(int i = 0; i<3; i++){
        BB[i] = B%10;
        B /= 10;
    }
    
    int product = 1;
    for(int a = 0; a < 3; a++){
        result[a] = BB[a]*A;
        result[3] += result[a]*product;
        printf("%d\n",result[a]);
        product *= 10;
    }
    
    printf("%d",result[3]);
    
    return 0;
}