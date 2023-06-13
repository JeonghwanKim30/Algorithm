#include <stdio.h>
#include <stdlib.h>

int main(){
    int n = 0;
    scanf("%d",&n);
    double sum;
    int max =0;
    int *scorearr = (int*)malloc(sizeof(int)*n);
    for(int i = 0 ; i < n; i++){
        scanf("%d",&scorearr[i]);
        if(scorearr[i] > max){max= scorearr[i];}
    }
    for(int i = 0 ; i< n ; i++){
        sum+=(((double)scorearr[i]/max))*100;
    }
    double newscore = sum/n;
    printf("%f",newscore);
    return 0;
}