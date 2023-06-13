#include <stdio.h>
#include <stdlib.h>

void sort(int * arr, int N);

int main(){
    int arr[5];
    int sum = 0;
    for(int i = 0 ; i < 5 ; i++){
        scanf("%d",&arr[i]);
        sum += arr[i];
    }
    sort(arr, 5);
    printf("%d\n%d",sum/5,arr[2]);
    return 0;
}

void sort(int * arr, int N){
    int temp;
    for (int i = 0 ; i<N-1; i++){
        for(int j = 0 ; j <N-1-i;j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return;
}