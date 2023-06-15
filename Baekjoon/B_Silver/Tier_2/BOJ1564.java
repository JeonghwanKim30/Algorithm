import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1;
		long diff = 1000000000000L;
		// 팩토리얼 구현부
		while (n != 0) {
			sum = ((n) * (sum));
			while (sum % 10 == 0) {
				sum /= 10;
			}
			sum %= diff;
			n--;
		}
		int f5 = (int)(sum % 100000);
		if (f5 < 10000 && f5 > 0) {
			int cop = 10000;
			while (f5 < cop) {
				System.out.printf("0");
				cop /= 10;
			}
		}
		System.out.println(f5);
		return;
	}	
}