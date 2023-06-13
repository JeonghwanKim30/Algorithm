#include <stdio.h>

int main() {
  int n = 0;
  int sum = 0;
  scanf("%d",&n);
  for(int i = 0 ; i < n ; i++){
    int arr[26] = {0};
    char str[101] = {};
    scanf("%s",str);
    int idx = 0;
    while(str[idx]!= 0){
      char flag;
      flag = str[idx];
      arr[(int)flag - (int)('a')]++;
      idx++;
      while(str[idx]==flag){
        idx++;
        }
    }
    sum++;
    for(int j = 0 ; j < 26; j++){
      if(arr[j] >1) {sum--; break;}
    }
  }
    printf("%d",sum);
    return 0;
}
  