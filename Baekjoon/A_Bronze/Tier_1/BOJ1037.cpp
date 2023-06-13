#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int N;
    scanf("%d",&N);
    
    int temp;
    int max = 0;
    int min= 1000000;
    for(int i = 0 ; i < N ; i++){
        scanf("%d",&temp);
        if(temp > max) max = temp;
        if(temp < min) min = temp;
    }
 
    printf("%d",max*min);
    return 0;
}