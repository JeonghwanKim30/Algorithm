#include <stdio.h>

int main(){
    
    int a, b;
    int sum = 0;
    scanf("%d %d",&a,&b);
    int product = 100;
    while(a>0){
        if(a%10 == b%10){
            sum += (a%10)*product;
            a /= 10;
            b /= 10;
            product /= 10;
        }else{
            if(a%10 > b%10){
                while(a>0){
                    sum += (a%10)*product;
                    a/= 10;
                    product /= 10;
                }
            }else{
                while(b>0){
                    sum += (b%10)*product;
                    b/= 10;
                    product /= 10;
                }
            }
        }
      }
    printf("%d",sum);
    return 0;
}