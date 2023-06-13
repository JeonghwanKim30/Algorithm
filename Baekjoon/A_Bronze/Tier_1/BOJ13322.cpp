#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

  char arr[100001];
  scanf("%s",arr);

  for(int i = 0 ; i < strlen(arr); i++){
    printf("%d\n",i);
  }
   return 0;
}