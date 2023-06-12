#include <stdio.h>
#include <string.h>

int main() {

	int hour, minute;
	int take_time;

	scanf("%d %d %d", &hour, &minute, &take_time);

	if (minute + take_time < 60) { printf("%d %d", hour, minute + take_time); }
	if (minute + take_time >= 60 && hour+(minute+take_time)/60 < 24) { printf("%d %d", hour + (minute + take_time) / 60, (minute + take_time)%60); }
	if (minute + take_time >= 60 && hour + (minute + take_time) / 60 >= 24) { printf("%d %d", hour + (minute + take_time) / 60 - 24, (minute + take_time) % 60); }
}