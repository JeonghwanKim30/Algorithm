#include <stdio.h>

int main(){
    int max =0;
    int a = 1;
    int b = 1;
    int in;
    for(int i = 1 ; i<= 9 ; i ++){
        for(int j = 1; j <=9 ;j++){
            scanf("%d",&in);
            if(max < in){
                a = i;
                b = j;
                max = in;
            }
        }  
    }
    printf("%d\n%d %d",max,a,b);
    return 0;
}