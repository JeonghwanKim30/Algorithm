#include <stdio.h>
#include <stdlib.h>

void sort(int * arr, int N);

int main(){
    
    int N;
    scanf("%d",&N);
    
    int *arr = (int*)malloc(sizeof(int)*N);
    
    for(int i = 0 ; i < N; i++){
        scanf("%d",&arr[i]);
    }
    sort(arr, N);
    for(int i = 0 ; i < N; i++){
        printf("%d\n",arr[i]);
    }
    
    return 0;
}

void sort(int * arr, int N){
    int temp =0;
    for(int i = 0 ; i < N-1;i++){
        for(int j = 0; j < N-1 -i ; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
  return;
}