#include <stdio.h>
#include <string.h>

int main() {
    char arr[16] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
    char n[7];
    scanf("%s", n);

    int count = 0;
    while (n[count] != '\0') {
        count++;
    }
    int sum = 0 ;
    int product = 1;
    for (int a = count-1; a >= 0; a--) {
        for(int i = 0 ; i<16; i++){
          if(n[a] == arr[i]){sum += i*product;}
        }
      product *=16;
    }
  printf("%d",sum);
    return 0;
}