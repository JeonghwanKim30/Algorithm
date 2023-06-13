#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	char str[1000000];
	scanf("%s", str);
	int idx = 0;
	int arr[26] = {0};
	while (str[idx] != 0) {
		if ((int)(str[idx]) >= 65 && (int)(str[idx]) <= 90) {
			arr[(int)(str[idx]) - 65]++;
		}
		if ((int)(str[idx]) >= 97 && (int)(str[idx]) <= 122) {
			arr[(int)(str[idx]) - 97]++;
		}
		idx++;
	}
  int max = 0;
  int flag = 0;
  int save = 0;
  for(int i = 0 ; i < 26; i++){
    if(arr[i] == max){flag = 1;}
    if(arr[i] > max){flag = 0; max = arr[i]; save = i;}
  }
  if(flag == 1){printf("?");}
  else{
    printf("%c",(char)(save+65));
  }
	return 0;
}