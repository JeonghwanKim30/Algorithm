#include <stdio.h>

int main() {
    long long start,product,sell;
    scanf("%llu %llu %llu",&start, &product, &sell);
    if(start <0) printf("-1");
    if(product >= sell){ printf("-1");}
    if(product < sell){
      long long count = 0;
      long long diff = sell - product;
      count = start/diff +1;
      printf("%llu",count);
      }
    return 0;
}
  