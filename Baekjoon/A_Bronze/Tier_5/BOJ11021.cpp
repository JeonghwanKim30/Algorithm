#include <stdio.h>

int main(){
    
    int n = 0;
    scanf("%d",&n);
    int a;
    int b;
    for(int i = 0 ; i < n ;i++){
        scanf("%d %d",&a,&b);
        printf("Case #%d: %d\n",i+1,a+b);
    }
    return 0;
}