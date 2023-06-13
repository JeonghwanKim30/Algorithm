#include <stdio.h>
#include <stdlib.h>

void sort(int*arr, int N);

int main(){
    int N, min;
    scanf("%d %d",&N,&min);
    
    int *arr = (int*)malloc(sizeof(int)*N);
    for(int i = 0 ; i <N;i++){
        scanf("%d",&arr[i]);
    }
    sort(arr,N);
    
    printf("%d",arr[min-1]);
    return 0;
}

void sort(int *arr, int N){
    int temp;
    for(int i = 0 ; i<N-1;i++){
        for(int j = 0 ; j<N-1-i;j++){
            if(arr[j] < arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    
}